package com.exam.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.myapp.entity.Admin;
import com.exam.myapp.service.AdminService;

@Controller
@RequestMapping
public class AdminController {

		@Autowired
		private AdminService admService;
	
		public AdminService getAdmService() {
		return admService;
	}

	public void setAdmService(AdminService admService) {
		this.admService = admService;
	}

		@RequestMapping(value = "/ajoutAdmin", method = RequestMethod.POST)
		public String ajout(Admin admin) {

			admService.ajout(admin);
		

			return "redirect:findAllAdmin";
		}

		@RequestMapping(value = "/supprAdmin", method = RequestMethod.POST)
		public String suppr(Long id) {

			admService.suppr(id);

			return "redirect:findAllAdmin";
		}

		@RequestMapping(value = "/modifAdmin", method = RequestMethod.POST)
		public String modif(Admin admin) {

			admService.modif(admin);

			return "redirect:findAllAdmin";
		}

		@RequestMapping(value = "/findAdmin", method = RequestMethod.GET)
		public String find(Long id, ModelMap model) {

			model.addAttribute("findAdmin", admService.find(id));

			return "admin";
		}

		@RequestMapping(value = "/findAllAdmin", method = RequestMethod.GET)
		public String findAll(ModelMap model) {

			model.addAttribute("allAdmin", admService.findAll());

			return "admin";
		}
	}


