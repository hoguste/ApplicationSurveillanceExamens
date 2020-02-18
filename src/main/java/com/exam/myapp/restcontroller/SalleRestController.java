package com.exam.myapp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exam.myapp.entity.Salle;
import com.exam.myapp.service.SalleService;

@CrossOrigin
@RestController
@RequestMapping(path="/salleRC")
public class SalleRestController {

	@Autowired
	private SalleService saser;

	public SalleService getSaser() {
		return saser;
	}

	public void setSaser(SalleService saser) {
		this.saser = saser;
	}

	@RequestMapping(value="/ajout", method=RequestMethod.POST)
	public ResponseEntity<Object> ajout(@RequestBody Salle sal) {

		saser.ajout(sal);

		return new ResponseEntity<Object>("Salle ajouté avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/suppr/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> suppr(@RequestBody Salle sal) {

		saser.suppr(sal);

		return new ResponseEntity<Object>("Salle supprimé avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/modif", method=RequestMethod.POST)
	public ResponseEntity<Object> ajout(@RequestBody Salle sal) {

		saser.modif(sal);

		return new ResponseEntity<Object>("Salle modifié avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/find/{id}", method= RequestMethod.GET)
	public ResponseEntity<Object> find(@PathVariable("id") Long id, @RequestBody Salle sal) {

		return new ResponseEntity<Object>(saser.find(id), HttpStatus.OK);


	}
	
	@RequestMapping(value="/findAll", method= RequestMethod.GET)
	public ResponseEntity<Object> findAll() {
		
		return new ResponseEntity<Object>(saser.findAll(), HttpStatus.OK);

	}
}
