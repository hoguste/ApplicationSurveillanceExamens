package com.exam.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.myapp.entity.Grade;
import com.exam.myapp.service.GradeService;

@Controller
@RequestMapping(value = "/grade")

public class GradeController {

	@Autowired
	private GradeService graService;

	public GradeService getGraService() {
		return graService;
	}

	public void setGraService(GradeService graService) {
		this.graService = graService;
	}

	@RequestMapping(value = "/ajout", method = RequestMethod.POST)
	public String ajout(Grade grade) {

		graService.ajout(grade);

		return "redirect:findAll";
	}

	@RequestMapping(value = "/suppr", method = RequestMethod.DELETE)
	public String suppr(Long id) {

		graService.suppr(id);

		return "redirect:findAll";
	}

	@RequestMapping(value = "/modif", method = RequestMethod.POST)
	public String modif(Grade grade) {

		graService.modif(grade);

		return "redirect:findAll";
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(Long id, ModelMap model) {

		model.addAttribute("findGrade", graService.find(id));

		return "grade";
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public String findAll(ModelMap model) {

		model.addAttribute("allGrade", graService.findAll());

		return "grade";
	}

}
