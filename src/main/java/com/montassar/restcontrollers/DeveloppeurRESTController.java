package com.montassar.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.montassar.entities.Developpeur;
import com.montassar.services.DeveloppeurService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class DeveloppeurRESTController {
	@Autowired
	DeveloppeurService developpeurService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Developpeur> getAllDeveloppeurs() {
	return developpeurService.getAllDeveloppeurs();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Developpeur getDeveloppeurById(@PathVariable("id") Long id) 
	{ return developpeurService.getDeveloppeur(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Developpeur createDeveloppeur(@RequestBody Developpeur developpeur) {
	return developpeurService.saveDeveloppeur(developpeur);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Developpeur updateDeveloppeur(@RequestBody Developpeur developpeur) {
	return developpeurService.updateDeveloppeur(developpeur);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteDeveloppeur(@PathVariable("id") Long id)
	{
	developpeurService.deleteDeveloppeurById(id);
	}
	
	@RequestMapping(value="/devsSoc/{idSoc}",method = RequestMethod.GET)
	public List<Developpeur> getDeveloppeurBySocId(@PathVariable("idSoc") Long idSoc) {
	return developpeurService.findBySocieteIdS(idSoc);
	}

}
