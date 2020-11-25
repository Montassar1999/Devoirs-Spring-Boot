package com.montassar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montassar.entities.Developpeur;
import com.montassar.repos.DeveloppeurRepository;

@Service
public class DeveloppeurSeriviceImpl implements DeveloppeurService{
	
	@Autowired
	DeveloppeurRepository developpeurRepository;

	@Override
	public Developpeur saveDeveloppeur(Developpeur d) {
		return developpeurRepository.save(d);
	}

	@Override
	public Developpeur updateDeveloppeur(Developpeur d) {
		return developpeurRepository.save(d);
	}

	@Override
	public void deleteDeveloppeur(Developpeur d) {
		developpeurRepository.delete(d);
		
	}

	@Override
	public void deleteDeveloppeurById(Long id) {
		developpeurRepository.deleteById(id);
		
	}

	@Override
	public Developpeur getDeveloppeur(Long id) {
		return developpeurRepository.findById(id).get();
	}

	@Override
	public List<Developpeur> getAllDeveloppeurs() {
		return developpeurRepository.findAll();
	}

}
