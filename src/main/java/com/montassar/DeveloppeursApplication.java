package com.montassar;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.montassar.entities.Developpeur;
import com.montassar.services.DeveloppeurService;

@SpringBootApplication
public class DeveloppeursApplication implements CommandLineRunner{
	@Autowired
	DeveloppeurService developpeurService;


	public static void main(String[] args) {
		SpringApplication.run(DeveloppeursApplication.class, args);
		
			
	}
	@Override
	public void run(String... args) throws Exception {
		/*developpeurService.saveDeveloppeur(new Developpeur("Montassar", 2600.0, new Date()));
		developpeurService.saveDeveloppeur(new Developpeur("Ali", 2800.0, new Date()));
		developpeurService.saveDeveloppeur(new Developpeur("salah", 900.0, new Date()));*/
}
}