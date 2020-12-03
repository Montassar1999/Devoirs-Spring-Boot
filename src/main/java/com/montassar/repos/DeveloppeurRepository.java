package com.montassar.repos;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.montassar.entities.Developpeur;
import com.montassar.entities.Societe;
@RepositoryRestResource(path = "rest")
public interface DeveloppeurRepository extends JpaRepository<Developpeur,Long>{
	
	List<Developpeur> findByNom(String nom);
	List<Developpeur> findByNomContains(String nom); 
	 
	/*@Query("select d from Developpeur d where d.nom like %?1 and d.salaire > ?2")
	List<Developpeur> findByNomSalaire (String nom, Double salaire);*/
	
	@Query("select d from Developpeur d where d.nom like %:nom and d.salaire > :salaire")
	List<Developpeur> findByNomSalaire (@Param("nom") String nom,@Param("salaire") Double salaire);
	
	@Query("select d from Developpeur d where d.societe = ?1")
	List<Developpeur> findBySociete (Societe societe);
	
	
	List<Developpeur> findBySocieteIdS(Long id);
	
	
	List<Developpeur> findByOrderByNomAsc();
	
	
	@Query("select d from Developpeur d order by d.nom ASC, d.salaire DESC")
	List<Developpeur> trierDeveloppeursNomsSalaire ();

}
