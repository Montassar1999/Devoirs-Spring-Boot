package com.montassar;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.montassar.entities.Developpeur;
import com.montassar.entities.Societe;
import com.montassar.repos.DeveloppeurRepository;

@SpringBootTest
class DeveloppeursApplicationTests {

	@Autowired
	private DeveloppeurRepository developpeurRepository;
	
	@Test
	public void testCreateDeveloppeur() {
		Developpeur dev=new Developpeur("Ali",1300.0,new Date());
		developpeurRepository.save(dev);
	}
	
	@Test
	public void testFindDeveloppeur()
	{
		Developpeur d=developpeurRepository.findById(1L).get();
		System.out.println(d);
	}
	@Test
	public void testUpdateDeveloppeur()
	{
		Developpeur d=developpeurRepository.findById(1L).get();
		d.setSalaire(1800.0);
		developpeurRepository.save(d);
	}
	
	@Test
	public void testDeleteDeveloppeur()
	{
		developpeurRepository.deleteById(1L);
	}
	
	@Test
	public void testListerTousDeveloppeurs()
	{
		List<Developpeur> devs=developpeurRepository.findAll();
		for(Developpeur d:devs)
		{
			System.out.println(d);
		}
	}
	
	@Test
	 public void testFindByNom()
	 {
	 List<Developpeur> devs = developpeurRepository.findByNom("montassar");
	 for (Developpeur d : devs)
	 {
	 System.out.println(d);
	 }
	 }
	 @Test
	 public void testFindByNomContains ()
	 {
	 List<Developpeur> devs=developpeurRepository.findByNomContains("mo");
	 for (Developpeur d : devs)
	 {
	 System.out.println(d);
	 } }
	 
	@Test
	 public void testfindByNomSalaire()
	 {
	 List<Developpeur> devs = developpeurRepository.findByNomSalaire("montassar", 1000.0);
	 for (Developpeur d : devs)
	 {
	 System.out.println(d);
	 }
	 }
	
	@Test
	public void testfindBySociete()
	{
	Societe s = new Societe();
s.setIdS(1L);
	List<Developpeur> devs = developpeurRepository.findBySociete(s);
	for (Developpeur d : devs)
	{
	System.out.println(d);
	}
	}

	
	@Test
	public void findBySocieteIdS()
	{
	List<Developpeur> devs = developpeurRepository.findBySocieteIdS(1L);
	for (Developpeur d : devs)
	{
	System.out.println(d);
	}
	 }
	
	
	@Test
	public void testfindByOrderByNomDeveloppeurAsc()
	{
	List<Developpeur> devs =developpeurRepository.findByOrderByNomAsc();
	for (Developpeur d:devs)
	{
	System.out.println(d);
	}
	}
	
	
	@Test
	public void testTrierDeveloppeursNomsSalaire()
	{
	List<Developpeur> devs = developpeurRepository.trierDeveloppeursNomsSalaire();
	for (Developpeur d : devs)
	{
	System.out.println(d);
	}
	}


}
