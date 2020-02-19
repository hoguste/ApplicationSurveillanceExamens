package com.exam.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class HomeController {
	
	@RequestMapping(value="/")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="/erreur")
	public String erreur() {
		return "erreur";
	}
	
	@RequestMapping(value="/login")
	public String login2() {
		return "login";
	}
	
	@RequestMapping(value="/admin")
	public String admin() {
		return "admin";
	}
	
	@RequestMapping(value="/enseignant")
	public String enseignant() {
		return "enseignant";
	}
	
	@RequestMapping(value="/grade")
	public String grade() {
		return "grade";
	}
	
	@RequestMapping(value="/salle")
	public String salle() {
		return "salle";
	}
	
	@RequestMapping(value="/seance")
	public String seance() {
		return "seance";
	}

}
