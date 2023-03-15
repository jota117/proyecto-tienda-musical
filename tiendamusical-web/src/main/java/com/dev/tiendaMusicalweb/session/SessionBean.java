/**
 * 
 */
package com.dev.tiendaMusicalweb.session;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.dev.tiendaMusicalentities.entities.Persona;

/**
 * @author Eliezer
 * Clase que mantendra la informacion en la sesion del usuario
 *
 */
@ManagedBean
@SessionScoped
public class SessionBean {
	
	private Persona persona;
	
	public void init() {
		System.out.println("Creando sesion......");
	}

	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	

}
