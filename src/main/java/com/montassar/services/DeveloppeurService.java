package com.montassar.services;

import java.util.List;

import com.montassar.entities.Developpeur;
import com.montassar.entities.Societe;

public interface DeveloppeurService {
Developpeur saveDeveloppeur(Developpeur d);
Developpeur updateDeveloppeur(Developpeur d);
void deleteDeveloppeur(Developpeur d);
void deleteDeveloppeurById(Long id);
Developpeur getDeveloppeur(Long id);
List<Developpeur> getAllDeveloppeurs();
List<Developpeur> findByNom(String nom);
List<Developpeur> findByNomContains(String nom);
List<Developpeur> findByNomSalaire (String nom, Double salaire);
List<Developpeur> findBySociete(Societe societe);
List<Developpeur> findBySocieteIdS(Long id);
List<Developpeur> findByOrderByNomAsc();
List<Developpeur> trierDeveloppeursNomsSalaire();
}
