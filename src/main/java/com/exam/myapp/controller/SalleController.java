package com.exam.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.myapp.entity.Salle;
import com.exam.myapp.service.SalleService;

@Controller
@RequestMapping
public class SalleController {

	@Autowired
	private SalleService salService;

	public SalleService getSalService() {
		return salService;
	}

	public void setSalService(SalleService salService) {
		this.salService = salService;
	}

	@RequestMapping(value = "/ajoutSalle", method = RequestMethod.POST)
	public String ajout(Salle salle) {

		salService.ajout(salle);

		return "redirect:findAllSalle";
	}

	@RequestMapping(value = "/supprSalle", method = RequestMethod.POST)
	public String suppr(Long id) {

		salService.suppr(id);

		return "redirect:findAllSalle";
	}

	@RequestMapping(value = "/modifSalle", method = RequestMethod.POST)
	public String modif(Salle salle) {

		salService.modif(salle);

		return "redirect:findAllSalle";
	}

	@RequestMapping(value = "/findSalle", method = RequestMethod.GET)
	public String find(Long id, ModelMap model) {

		model.addAttribute("findSalle", salService.find(id));

		return "redirect:findAllSalle";
	}

	@RequestMapping(value = "/findAllSalle", method = RequestMethod.GET)
	public String findAll(ModelMap model) {

		model.addAttribute("allSalle", salService.findAll());

		return "salle";

	}

}
