package com.exam.myapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.myapp.entity.Enseignant;
import com.exam.myapp.entity.Grade;
import com.exam.myapp.entity.Seance;
import com.exam.myapp.service.EnseignantService;
import com.exam.myapp.service.GradeService;
import com.exam.myapp.service.SeanceService;

@Controller
@RequestMapping
public class EnseignantController {

	@Autowired
	private EnseignantService ensService;
	
	@Autowired
	private GradeService grdService;
	
	@Autowired
	private SeanceService seaService;
	
	public SeanceService getSeaService() {
		return seaService;
	}

	public void setSeaService(SeanceService seaService) {
		this.seaService = seaService;
	}

	public GradeService getGrdService() {
		return grdService;
	}

	public void setGrdService(GradeService grdService) {
		this.grdService = grdService;
	}

	public EnseignantService getEnsService() {
		return ensService;
	}

	public void setEnsService(EnseignantService ensService) {
		this.ensService = ensService;
	}

	@RequestMapping(value = "/ajoutEnseignant", method = RequestMethod.POST)
	public String ajout(Enseignant enseignant, ModelMap model) {
		
		ensService.ajout(enseignant);
		

		return "redirect:findAllEnseignant";
	}

	@RequestMapping(value = "/supprEnseignant", method = RequestMethod.POST)
	public String suppr(Long id) {

		ensService.suppr(id);

		return "redirect:findAllEnseignant";
	}
	
	@RequestMapping(value = "/modifEnseignant", method = RequestMethod.POST)
	public String modif(Enseignant enseignant) {

		ensService.modif(enseignant);

		return "redirect:findAllEnseignant";
	}
	
	@RequestMapping(value = "/findEnseignant", method = RequestMethod.GET)
	public String find(Long id, ModelMap model) {

		model.addAttribute("findEnseignant", ensService.find(id));

		return "enseignant";
	}

	@RequestMapping(value = "/findAllEnseignant", method = RequestMethod.GET)
	public String findAll(@ModelAttribute("enseignant")Enseignant enseignant, Grade grade, Seance seance, ModelMap model) { 

		model.addAttribute("allEnseignant", ensService.findAll());
		model.addAttribute("allGrade", grdService.findAll());
		model.addAttribute("allSeance", seaService.findAll());
		return "enseignant";
	}
}
