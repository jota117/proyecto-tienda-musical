/**
 * 
 */
package com.dev.tiendaMusicalentities.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author Eliezer
 *Clase que contiene los campos comunes de la base de datos que se pueden utilizar en varias tablas.
 *
 */

@MappedSuperclass
public class Common {

	@Column(name = "fechaCreacion", nullable = false)
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaActualizacion;
	
	@Column(name = "estatus")
	private boolean estatus;

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaActualizacion
	 */
	public LocalDateTime getFechaActualizacion() {
		return fechaActualizacion;
	}

	/**
	 * @param fechaActualizacion the fechaActualizacion to set
	 */
	public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
}
