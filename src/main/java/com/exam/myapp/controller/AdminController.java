package com.exam.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.myapp.entity.Admin;
import com.exam.myapp.service.AdminService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

		@Autowired
		private AdminService admService;
	
		public AdminService getAdmService() {
		return admService;
	}

	public void setAdmService(AdminService admService) {
		this.admService = admService;
	}

		@RequestMapping(value = "/ajout", method = RequestMethod.POST)
		public String ajout(Admin admin) {

			admService.ajout(admin);

			return "redirect:findAll";
		}

		@RequestMapping(value = "/suppr", method = RequestMethod.DELETE)
		public String suppr(Long id) {

			admService.suppr(id);

			return "redirect:findAll";
		}

		@RequestMapping(value = "/modif", method = RequestMethod.POST)
		public String modif(Admin admin) {

			admService.modif(admin);

			return "redirect:findAll";
		}

		@RequestMapping(value = "/find", method = RequestMethod.GET)
		public String find(Long id, ModelMap model) {

			model.addAttribute("findAdmin", admService.find(id));

			return "admin";
		}

		@RequestMapping(value = "/findAll", method = RequestMethod.GET)
		public String findAll(ModelMap model) {

			model.addAttribute("allAdmin", admService.findAll());

			return "admin";
		}
	}


