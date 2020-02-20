package com.exam.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.myapp.entity.Enseignant;
import com.exam.myapp.entity.Salle;
import com.exam.myapp.entity.Seance;
import com.exam.myapp.service.EnseignantService;
import com.exam.myapp.service.SalleService;
import com.exam.myapp.service.SeanceService;

@Controller
@RequestMapping
public class SeanceController {

	@Autowired
	private SeanceService seaService;
	
	@Autowired
	private EnseignantService ensService;
	
	@Autowired
	private SalleService salService;

	public EnseignantService getEnsService() {
		return ensService;
	}

	public void setEnsService(EnseignantService ensService) {
		this.ensService = ensService;
	}

	public SalleService getSalService() {
		return salService;
	}

	public void setSalService(SalleService salService) {
		this.salService = salService;
	}

	public SeanceService getSeaService() {
		return seaService;
	}

	public void setSeaService(SeanceService seaService) {
		this.seaService = seaService;
	}

	@RequestMapping(value = "/ajoutSeance", method = RequestMethod.POST)
	public String ajout(Seance seance, ModelMap model) {

		seaService.ajout(seance);

		return "redirect:findAllSeance";
	}

	@RequestMapping(value = "/supprSeance", method = RequestMethod.POST)
	public String suppr(Long id) {

		seaService.suppr(id);

		return "redirect:findAllSeance";
	}

	@RequestMapping(value = "/modifSeance", method = RequestMethod.POST)
	public String modif(Seance seance) {

		seaService.modif(seance);

		return "redirect:findAllSeance";
	}

	@RequestMapping(value = "/findSeance", method = RequestMethod.GET)
	public String find(Long id, ModelMap model) {

		model.addAttribute("findSeance", seaService.find(id));

		return "seance";
	}

	@RequestMapping(value = "/findAllSeance", method = RequestMethod.GET)
	public String findAll(@ModelAttribute("seance")Seance seance, Salle salle, Enseignant enseignant, ModelMap model) {

		model.addAttribute("allEnseignant", ensService.findAll());
		model.addAttribute("allSeance", seaService.findAll());
		model.addAttribute("allSalle", salService.findAll());

		return "seance";
	}

}
