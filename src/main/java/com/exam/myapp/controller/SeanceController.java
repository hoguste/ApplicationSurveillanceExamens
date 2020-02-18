package com.exam.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/seance")
public class SeanceController {

	@Autowired
	private SeanceService seaService;

	public SeanceService getSeaService() {
		return seaService;
	}

	public void setSeaService(SeanceService seaService) {
		this.seaService = seaService;
	}

	@RequestMapping(value = "/ajout", method = RequestMethod.POST)
	public String ajout(Seance seance) {

		seaService.ajout(seance);

		return "redirect:findAll";
	}

	@RequestMapping(value = "/suppr", method = RequestMethod.DELETE)
	public String suppr(Long id) {

		seaService.suppr(id);

		return "redirect:findAll";
	}

	@RequestMapping(value = "/modif", method = RequestMethod.POST)
	public String modif(Seance seance) {

		seaService.modif(seance);

		return "redirect:findAll";
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(Long id, ModelMap model) {

		model.addAttribute("findSeance", seaService.find());

		return "seance";
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public String findAll(ModelMap model) {

		model.addAttribute("allEnseignant", seaService.findAll());

		return "seance";
	}

}
