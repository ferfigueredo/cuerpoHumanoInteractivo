package com.humanbody.app.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class SistemaCuerpoHumano {

	@Id
	private long id;
	private String nombre;
	private String descripcion;
	
//	
//	@OneToMany
//    @Cascade({org.hibernate.annotations.CascadeType.ALL})
//	private List<ParteCuerpoHumano> partes = new LinkedList<ParteCuerpoHumano>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

//	public List<ParteCuerpoHumano> getPartes() {
//		return partes;
//	}
//
//	public void setPartes(List<ParteCuerpoHumano> partes) {
//		this.partes = partes;
//	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
