package com.montassar.services;

import java.util.List;

import com.montassar.entities.Developpeur;

public interface DeveloppeurService {
Developpeur saveDeveloppeur(Developpeur d);
Developpeur updateDeveloppeur(Developpeur d);
void deleteDeveloppeur(Developpeur d);
void deleteDeveloppeurById(Long id);
Developpeur getDeveloppeur(Long id);
List<Developpeur> getAllDeveloppeurs();
}
