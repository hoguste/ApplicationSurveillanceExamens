package com.exam.myapp.security;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.myapp.entity.Admin;
import com.exam.myapp.entity.Enseignant;
import com.exam.myapp.service.AdminService;
import com.exam.myapp.service.EnseignantService;

@Controller
@RequestMapping
public class SecurityConfig extends HttpServlet{
	@Autowired
	private AdminService adser;
	
	@Autowired
	private EnseignantService ensser;
	

	public EnseignantService getEnsser() {
		return ensser;
	}

	public void setEnsser(EnseignantService ensser) {
		this.ensser = ensser;
	}

	public AdminService getAdser() {
		return adser;
	}

	public void setAdser(AdminService adser) {
		this.adser = adser;
	}

	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String identification(ModelMap model, HttpServletRequest request) {
		List<Admin> lstad = adser.findAll();
		List<Enseignant> lstens = ensser.findAll();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		for (int i = 0; i < lstad.size(); i++) {
			if (lstad.get(i).getUsername().equals(username) && lstad.get(i).getPassword().equals(password)) {
				return "home";

			}
		}
		for (int i = 0; i < lstens.size(); i++) {
			if (lstens.get(i).getUsername().equals(username) && lstens.get(i).getPassword().equals(password)) {
				return "home";

			}
		}
		return "erreur";

	}
	
	@RequestMapping(value = "/logout", method=RequestMethod.POST)
	public String deconnexion() {
		return "login";
	}

}
