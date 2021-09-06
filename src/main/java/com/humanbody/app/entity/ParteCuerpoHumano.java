package com.humanbody.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ParteCuerpoHumano implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5890090481030609382L;

	@Id
	private long id;
	
	//Maximo 28 caracteres
	private String nombre;
	
	//Maximo 840 caracteres
	private String detalle;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private SistemaCuerpoHumano sistema;
	
	
	public ParteCuerpoHumano() {
		super();
	}
	
	public ParteCuerpoHumano(String nom, String det) {
		super();
		this.nombre = nom;
		this.detalle = det;
	}
			
			
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public SistemaCuerpoHumano getSistema() {
		return sistema;
	}

	public void setSistema(SistemaCuerpoHumano sistema) {
		this.sistema = sistema;
	}
	
}
