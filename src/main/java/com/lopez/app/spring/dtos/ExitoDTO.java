//@Programador: Ing. Kevin Carlos Lopez Gonzalez
//@Fecha: 02/11/2023
//@Ejercicio: Spring Boot Java
package com.lopez.app.spring.dtos;
public class ExitoDTO {
	//ATRIBUTO
	private String exito;
	//CONSTRUCTOR CON ARGUMENTO
	public ExitoDTO(String exito) {
		super();
		this.exito = exito;
	}
	//CONSTRUCTOR VACIO
	public ExitoDTO() {
		super();
	}
	//GETTERS AND SETTERS
	public String getExito() {
		return exito;
	}
	public void setExito(String exito) {
		this.exito = exito;
	}
}