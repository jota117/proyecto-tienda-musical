/**
 * 
 */
package com.dev.tiendaMusicaldata.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.dev.tiendaMusicalentities.entities.Persona;

/**
 * @author Eliezer
 * Clase DAO que realiza el CRUD CON SpringJPA para la tabla persona.
 *
 */

public interface PersonaDAO extends PagingAndSortingRepository<Persona, Long>{
	
	/**
	 * Metodo que permite consultar el usuario que trata de ingresar a sesion
	 * @param usuario {@link String} usuario capturado para la persona
	 *@param password {@link String} contraseña capturada  por la persona
	 *@return {@link Persona} objeto con la persona encontrada
	 */
	@Query("SELECT p FROM Persona p WHERE p.usuario = ?1 AND p.password = ?2")
	Persona findByUsuarioAndPassword(String usuario, String password);
}
