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

import com.exam.myapp.entity.Enseignant;
import com.exam.myapp.service.EnseignantService;

@CrossOrigin
@RestController
@RequestMapping(path="/enseignantRC")
public class EnseignantRestController {

	@Autowired
	private EnseignantService eser;
	
	public EnseignantService getEser() {
		return eser;
	}

	public void setEser(EnseignantService eser) {
		this.eser = eser;
	}

	@RequestMapping(value="/ajout", method=RequestMethod.POST)
	public ResponseEntity<Object> ajout(@RequestBody Enseignant ens) {

		eser.ajout(ens);

		return new ResponseEntity<Object>("enseignant ajouté avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/suppr/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> suppr(@RequestBody Enseignant ens) {

		eser.suppr(ens);

		return new ResponseEntity<Object>("Enseignant supprimé avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/modif", method=RequestMethod.POST)
	public ResponseEntity<Object> ajout(@RequestBody Enseignant ens) {

		eser.modif(ens);

		return new ResponseEntity<Object>("Enseignant modifié avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/find/{id}", method= RequestMethod.GET)
	public ResponseEntity<Object> find(@PathVariable("id") Long id, @RequestBody Enseignant ens) {

		return new ResponseEntity<Object>(eser.find(id), HttpStatus.OK);


	}
	
	@RequestMapping(value="/findAll", method= RequestMethod.GET)
	public ResponseEntity<Object> findAll() {
		
		return new ResponseEntity<Object>(eser.findAll(), HttpStatus.OK);

	}
}
