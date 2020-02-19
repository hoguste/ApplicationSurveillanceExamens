package com.exam.myapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.myapp.entity.Enseignant;
import com.exam.myapp.service.EnseignantService;

@Controller
@RequestMapping(value = "/enseignant")
public class EnseignantController {

	@Autowired
	private EnseignantService ensService;

	public EnseignantService getEnsService() {
		return ensService;
	}

	public void setEnsService(EnseignantService ensService) {
		this.ensService = ensService;
	}

	@RequestMapping(value = "/ajout", method = RequestMethod.POST)
	public String ajout(Enseignant enseignant) {

		ensService.ajout(enseignant);

		return "redirect:findAll";
	}

	@RequestMapping(value = "/suppr", method = RequestMethod.DELETE)
	public String suppr(Long id) {

		ensService.suppr(id);

		return "redirect:findAll";
	}
	
	@RequestMapping(value = "/modif", method = RequestMethod.POST)
	public String modif(Enseignant enseignant) {

		ensService.modif(enseignant);

		return "redirect:findAll";
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(Long id, ModelMap model) {

		model.addAttribute("findEnseignant", ensService.find(id));

		return "enseignant";
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public String findAll(ModelMap model) { 

		model.addAttribute("allEnseignant", ensService.findAll());

		return "enseignant";
	}
}
