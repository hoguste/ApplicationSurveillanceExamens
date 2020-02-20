package com.exam.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.myapp.entity.Grade;
import com.exam.myapp.service.GradeService;

@Controller
@RequestMapping

public class GradeController {

	@Autowired
	private GradeService graService;
	

	public GradeService getGraService() {
		return graService;
	}

	public void setGraService(GradeService graService) {
		this.graService = graService;
	}

	@RequestMapping(value = "/ajoutGrade", method = RequestMethod.POST)
	public String ajout(Grade grade) {

		graService.ajout(grade);

		return "redirect:findAllGrade";
	}

	@RequestMapping(value = "/supprGrade", method = RequestMethod.POST)
	public String suppr(Long id) {

		graService.suppr(id);

		return "redirect:findAllGrade";
	}

	@RequestMapping(value = "/modifGrade", method = RequestMethod.POST)
	public String modif(Grade grade) {

		graService.modif(grade);

		return "redirect:findAllGrade";
	}

	@RequestMapping(value = "/findGrade", method = RequestMethod.GET)
	public String find(Long id, ModelMap model) {

		model.addAttribute("findGrade", graService.find(id));

		return "redirect:findAllGrade";
	}

	@RequestMapping(value = "/findAllGrade", method = RequestMethod.GET)
	public String findAll(ModelMap model) {

		model.addAttribute("allGrade", graService.findAll());

		return "grade";
	}

}
