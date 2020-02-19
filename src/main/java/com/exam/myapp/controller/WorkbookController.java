package com.exam.myapp.controller;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.myapp.entity.Seance;
import com.exam.myapp.service.SeanceService;
import com.gembox.spreadsheet.CellStyle;
import com.gembox.spreadsheet.ExcelFile;
import com.gembox.spreadsheet.ExcelFont;
import com.gembox.spreadsheet.ExcelWorksheet;
import com.gembox.spreadsheet.HorizontalAlignmentStyle;
import com.gembox.spreadsheet.LengthUnit;
import com.gembox.spreadsheet.SaveOptions;
import com.gembox.spreadsheet.SpreadsheetInfo;

@Controller
@RequestMapping("workbook")
public class WorkbookController {
	 static {
	        SpreadsheetInfo.setLicense("FREE-LIMITED-KEY");
	 }
	  static SeanceService seserv = new SeanceService();
	    
	 
	 private static final List<Seance> DATA = seserv.findAll();

	      @RequestMapping(value = "/create", method = RequestMethod.GET)
	    public String create(Model model) {
	        model.addAttribute("workbookItemsWithFormat", new WorkbookItemsWithFormat("XLSX", DATA));
	        return "create";
	    }

	    @RequestMapping(value = "/create", method = RequestMethod.POST)
	    public HttpEntity<byte[]> create(@ModelAttribute("workbookItemsWithFormat") WorkbookItemsWithFormat workbookItemsWithFormat) throws IOException {
	        SaveOptions options = getSaveOptions(workbookItemsWithFormat.getSelectedFormat());
	        ExcelFile book = new ExcelFile();
	        ExcelWorksheet sheet = book.addWorksheet("Sheet1");

	        CellStyle style = sheet.getRow(0).getStyle();
	        style.getFont().setWeight(ExcelFont.BOLD_WEIGHT);
	        style.setHorizontalAlignment(HorizontalAlignmentStyle.CENTER);
	        sheet.getColumn(0).getStyle().setHorizontalAlignment(HorizontalAlignmentStyle.CENTER);

	        sheet.getColumn(0).setWidth(50, LengthUnit.PIXEL);
	        sheet.getColumn(1).setWidth(150, LengthUnit.PIXEL);
	        sheet.getColumn(2).setWidth(150, LengthUnit.PIXEL);
	        sheet.getColumn(3).setWidth(150, LengthUnit.PIXEL);
	        sheet.getColumn(4).setWidth(150, LengthUnit.PIXEL);
	        sheet.getColumn(5).setWidth(150, LengthUnit.PIXEL);
	        sheet.getColumn(6).setWidth(150, LengthUnit.PIXEL);
	        sheet.getColumn(7).setWidth(150, LengthUnit.PIXEL);
	        sheet.getColumn(8).setWidth(150, LengthUnit.PIXEL);
	        sheet.getColumn(9).setWidth(150, LengthUnit.PIXEL);
	        sheet.getColumn(10).setWidth(150, LengthUnit.PIXEL);
	        

	        sheet.getCell("A1").setValue("ID");
	        sheet.getCell("B1").setValue("Type");
	        sheet.getCell("C1").setValue("Debut");
	        sheet.getCell("D1").setValue("Fin");
	        sheet.getCell("E1").setValue("Duree");
	        sheet.getCell("F1").setValue("Matiere");
	        sheet.getCell("G1").setValue("Nom Enseignant1");
	        sheet.getCell("H1").setValue("Prenom Enseignant 1");
	        sheet.getCell("I1").setValue("Nom Enseignant2");
	        sheet.getCell("J1").setValue("Prenom Enseignant 2");
	        sheet.getCell("K1").setValue("Salle");
	        
	        for (int row = 1; row <= workbookItemsWithFormat.getItems().size(); row++) {
	            Seance item = workbookItemsWithFormat.getItems().get(row - 1);
	            sheet.getCell(row, 0).setValue(item.getId());
	            sheet.getCell(row, 1).setValue(item.getType());
	            sheet.getCell(row, 2).setValue(item.getDateDebut());
	            sheet.getCell(row, 3).setValue(item.getDateFin());
	            sheet.getCell(row, 4).setValue(item.getDuree());
	            sheet.getCell(row, 5).setValue(item.getMatiere());
	            sheet.getCell(row, 6).setValue(item.getEnseignants().get(0).getNom());
	            sheet.getCell(row, 7).setValue(item.getEnseignants().get(0).getPrenom());
	            sheet.getCell(row, 8).setValue(item.getEnseignants().get(1).getNom());
	            sheet.getCell(row, 9).setValue(item.getEnseignants().get(1).getPrenom());
	            sheet.getCell(row, 10).setValue(item.getSalle());
	        }

	        byte[] bytes = getBytes(book, options);

	        HttpHeaders header = new HttpHeaders();
	        header.set(HttpHeaders.CONTENT_TYPE, options.getContentType());
	        header.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=Create." + workbookItemsWithFormat.getSelectedFormat().toLowerCase());
	        header.setContentLength(bytes.length);

	        return new HttpEntity<>(bytes, header);
	    }

	    private byte[] getBytes(ExcelFile book, SaveOptions options) throws IOException {
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        book.save(outputStream, options);
	        return outputStream.toByteArray();
	    }

	    private static SaveOptions getSaveOptions(String format) {
	        switch (format.toUpperCase()) {
	            case "XLSX":
	                return SaveOptions.getXlsxDefault();
	            case "XLS":
	                return SaveOptions.getXlsDefault();
	            case "ODS":
	                return SaveOptions.getOdsDefault();
	            default:
	                throw new IllegalArgumentException("Format '" + format + "' is not supported.");
	        }
	    }


		    public static class WorkbookItemsWithFormat {

	        public String selectedFormat;
	        public List<Seance> items = new ArrayList<>();

	        public WorkbookItemsWithFormat(String selectedFormat, List<Seance> items) {
	            this.selectedFormat = selectedFormat;
	            this.items = items;
	        }

	        public WorkbookItemsWithFormat() {
	        }

	        public String getSelectedFormat() {
	            return selectedFormat;
	        }

	        public void setSelectedFormat(String selectedFormat) {
	            this.selectedFormat = selectedFormat;
	        }

	        public List<Seance> getItems() {
	            return items;
	        }

	        public void setItems(List<Seance> items) {
	            this.items = items;
	        }
	    }
	}

