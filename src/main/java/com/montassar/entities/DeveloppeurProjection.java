package com.montassar.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomDev", types = { Developpeur.class })
public interface DeveloppeurProjection {
	public String getNom();
}
