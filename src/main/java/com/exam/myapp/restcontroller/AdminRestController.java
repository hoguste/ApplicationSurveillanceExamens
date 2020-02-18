package com.exam.myapp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exam.myapp.service.AdminService;
import com.exam.myapp.entity.Admin;

@CrossOrigin
@RestController
@RequestMapping(path="/adminRC")
public class AdminRestController {

	@Autowired
	private AdminService aser;

	public AdminService getAser() {
		return aser;
	}

	public void setAser(AdminService aser) {
		this.aser = aser;
	}
	
	@RequestMapping(value="/ajout", method=RequestMethod.POST)
	public ResponseEntity<Object> ajout(@RequestBody Admin adm) {

		aser.ajout(adm);

		return new ResponseEntity<Object>("admin ajouté avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/suppr/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> suppr(@RequestBody Admin adm) {

		aser.suppr(adm);

		return new ResponseEntity<Object>("admin supprimé avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/modif", method=RequestMethod.POST)
	public ResponseEntity<Object> ajout(@RequestBody Admin adm) {

		aser.modif(adm);

		return new ResponseEntity<Object>("admin modifié avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/find/{id}", method= RequestMethod.GET)
	public ResponseEntity<Object> find(@PathVariable("id") Long id, @RequestBody Admin adm) {

		return new ResponseEntity<Object>(aser.find(id), HttpStatus.OK);


	}
	
	@RequestMapping(value="/findAll", method= RequestMethod.GET)
	public ResponseEntity<Object> findAll() {
		
		return new ResponseEntity<Object>(aser.findAll(), HttpStatus.OK);

	}
}
