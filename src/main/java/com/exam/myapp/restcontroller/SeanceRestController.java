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

import com.exam.myapp.entity.Seance;
import com.exam.myapp.service.SeanceService;

@CrossOrigin
@RestController
@RequestMapping(path="/seanceRC")
public class SeanceRestController {
	
	@Autowired
	private SeanceService seser;

	public SeanceService getSeser() {
		return seser;
	}

	public void setSeser(SeanceService seser) {
		this.seser = seser;
	}

	@RequestMapping(value="/ajout", method=RequestMethod.POST)
	public ResponseEntity<Object> ajout(@RequestBody Seance sea) {

		seser.ajout(sea);

		return new ResponseEntity<Object>("Seance ajouté avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/suppr/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> suppr(@RequestBody Long id) {

		seser.suppr(id);

		return new ResponseEntity<Object>("Seance supprimé avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/modif", method=RequestMethod.POST)
	public ResponseEntity<Object> modif(@RequestBody Seance sea) {

		seser.modif(sea);

		return new ResponseEntity<Object>("Seance modifié avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/find/{id}", method= RequestMethod.GET)
	public ResponseEntity<Object> find(@PathVariable("id") Long id, @RequestBody Seance sea) {

		return new ResponseEntity<Object>(seser.find(id), HttpStatus.OK);


	}
	
	@RequestMapping(value="/findAll", method= RequestMethod.GET)
	public ResponseEntity<Object> findAll() {
		
		return new ResponseEntity<Object>(seser.findAll(), HttpStatus.OK);

	}
}
