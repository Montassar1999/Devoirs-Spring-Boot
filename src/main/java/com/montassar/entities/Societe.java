package com.montassar.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Societe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idS;
	private String nomS;
	private String descriptionS;
	@JsonIgnore
	@OneToMany(mappedBy = "societe")
	private List<Developpeur> developpeurs;
}
