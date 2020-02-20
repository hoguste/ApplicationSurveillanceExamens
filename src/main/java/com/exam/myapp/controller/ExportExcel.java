package com.exam.myapp.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.myapp.entity.Seance;
import com.exam.myapp.service.SeanceService;

@Controller
@RequestMapping
public class ExportExcel {
	@Autowired
	SeanceService seaser;

	public SeanceService getSeaser() {
		return seaser;
	}

	public void setSeaser(SeanceService seaser) {
		this.seaser = seaser;
	}

	private String[] columns = { "IdSeance", "Nom enseignant 1", "Prenom enseignant 1", "Nom enseignant 2",
			"Prenom enseignant 2" };

	public void exportExcel() throws IOException {

		List<Seance> lstsea = seaser.findAll();
		Workbook workbook = new XSSFWorkbook();

		CreationHelper createHelper = workbook.getCreationHelper();

		// Create a Sheet
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("Seances");

		// Create a Font for styling header cells
		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeightInPoints((short) 14);
		headerFont.setColor(IndexedColors.BLUE.getIndex());

		// Create a CellStyle with the font
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);

		// Create a Row
		Row headerRow = ((org.apache.poi.ss.usermodel.Sheet) sheet).createRow(0);

		// Create cells
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
			cell.setCellStyle(headerCellStyle);
		}

		// Create Other rows and cells with employees data
		int rowNum = 1;
		for (int j = 0; j < lstsea.size(); j++) {
			Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).createRow(rowNum++);
			if (String.valueOf(lstsea.get(j).getId()) != null) {

				row.createCell(0).setCellValue(lstsea.get(j).getId());
			}
			if (lstsea.get(j).getEnseignant1() != null) {

				row.createCell(1).setCellValue(lstsea.get(j).getEnseignant1().getNom());
				row.createCell(2).setCellValue(lstsea.get(j).getEnseignant1().getPrenom());
			}
			if (lstsea.get(j).getEnseignant2() != null) {

				row.createCell(3).setCellValue(lstsea.get(j).getEnseignant2().getNom());
				row.createCell(4).setCellValue(lstsea.get(j).getEnseignant2().getPrenom());
			}

		}

		// Resize all columns to fit the content size
		for (int i = 0; i < columns.length; i++) {
			((org.apache.poi.ss.usermodel.Sheet) sheet).autoSizeColumn(i);
		}

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream(
				"C:\\Users\\IN-ST-029\\Desktop\\Projet Final - Application Gestion Surveillance Examens\\ApplicationSurveillanceExamens-jspmany\\Fichier_Seances.xlsx");
		workbook.write(fileOut);
		fileOut.close();

		// Closing the workbook
		workbook.close();
		
		fileOut.close();

	}

	@RequestMapping(value = "/export", method = RequestMethod.POST)
	public String export(ModelMap model) throws IOException {
		exportExcel();
		model.addAttribute("exportsuccess", "Export sous Excel réalisé avec succès !");
		return "seance";
	}
}
