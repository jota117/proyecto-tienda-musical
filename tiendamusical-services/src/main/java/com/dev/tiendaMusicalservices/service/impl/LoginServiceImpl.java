/**
 * 
 */
package com.dev.tiendaMusicalservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.tiendaMusicaldata.dao.PersonaDAO;
import com.dev.tiendaMusicalentities.entities.Persona;
import com.dev.tiendaMusicalservices.service.LoginService;

/**
 * @author Eliezer
 * Clase que implementa las funciones  para la logica de negocio para la pantalla de login
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private PersonaDAO personaDAOImpl;

	@Override
	public Persona consultarUsuarioLogin(String usuario, String password) {
		
		return this.personaDAOImpl.findByUsuarioAndPassword(usuario, password);
	}

}
