package com.montassar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montassar.entities.Developpeur;
import com.montassar.entities.Societe;
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

	@Override
	public List<Developpeur> findByNom(String nom) {
		return developpeurRepository.findByNom(nom);
	}

	@Override
	public List<Developpeur> findByNomContains(String nom) {
		return developpeurRepository.findByNomContains(nom);
	}

	@Override
	public List<Developpeur> findByNomSalaire(String nom, Double salaire) {
		return developpeurRepository.findByNomSalaire(nom, salaire);
	}

	@Override
	public List<Developpeur> findBySociete(Societe societe) {
		return developpeurRepository.findBySociete(societe);
	}

	@Override
	public List<Developpeur> findBySocieteIdS(Long id) {
		return developpeurRepository.findBySocieteIdS(id);
	}

	@Override
	public List<Developpeur> findByOrderByNomAsc() {
		return developpeurRepository.findByOrderByNomAsc();
	}

	@Override
	public List<Developpeur> trierDeveloppeursNomsSalaire() {
		return developpeurRepository.trierDeveloppeursNomsSalaire();
	}

}
