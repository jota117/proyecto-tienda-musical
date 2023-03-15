/**
 * 
 */
package com.dev.tiendaMusicalweb.utils;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Eliezer
 * Clase generada para crear funciones globales o comunes entre clases del proyecto
 *
 */
public class CommonUtils {
	public static void mostrarMensaje(Severity severity, String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
	}
	
	/**
	 * Metodo que permite redireccionar entre pantallas del aplicativo
	 * @param url {@link String} direcion o pantalla a cambiar
	 * @throws IOException {@link IOException} excepcion en caso de error al encontar una pagina
	 *
	 */
	
	public static void redireccionar(String url) throws IOException {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		String contextPath = externalContext.getRequestContextPath();
		externalContext.redirect(contextPath + url);
		
	}

}
