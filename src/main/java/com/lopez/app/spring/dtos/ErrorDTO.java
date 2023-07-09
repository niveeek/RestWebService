//@Programador: Ing. Kevin Carlos Lopez Gonzalez
//@Fecha: 02/11/2023
//@Ejercicio: Spring Boot Java
package com.lopez.app.spring.dtos;
public class ErrorDTO {
	//ATRIBUTO
	private String error;
	//CONSTRUCTOR CON ARGUMENTO
	public ErrorDTO(String error) {
		super();
		this.error = error;
	}
	//CONSTRUCTOR VACIO
	public ErrorDTO() {
		super();
	}
	//GETTERS AND SETTERS
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}