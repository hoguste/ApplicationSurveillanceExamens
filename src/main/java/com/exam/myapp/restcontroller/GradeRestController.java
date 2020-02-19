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

import com.exam.myapp.entity.Grade;
import com.exam.myapp.service.GradeService;

@CrossOrigin
@RestController
@RequestMapping(path="/gradeRC")
public class GradeRestController {

	@Autowired
	private GradeService gser;

	public GradeService getGser() {
		return gser;
	}

	public void setGser(GradeService gser) {
		this.gser = gser;
	}

	@RequestMapping(value="/ajout", method=RequestMethod.POST)
	public ResponseEntity<Object> ajout(@RequestBody Grade grd) {

		gser.ajout(grd);

		return new ResponseEntity<Object>("Grade ajouté avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/suppr/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> suppr(@RequestBody Long id) {

		gser.suppr(id);

		return new ResponseEntity<Object>("Grade supprimé avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/modif", method=RequestMethod.POST)
	public ResponseEntity<Object> modif(@RequestBody Grade grd) {

		gser.modif(grd);

		return new ResponseEntity<Object>("Grade modifié avec succès", HttpStatus.OK);

	}
	
	@RequestMapping(value="/find/{id}", method= RequestMethod.GET)
	public ResponseEntity<Object> find(@PathVariable("id") Long id, @RequestBody Grade grd) {

		return new ResponseEntity<Object>(gser.find(id), HttpStatus.OK);


	}
	
	@RequestMapping(value="/findAll", method= RequestMethod.GET)
	public ResponseEntity<Object> findAll() {
		
		return new ResponseEntity<Object>(gser.findAll(), HttpStatus.OK);

	}
}
