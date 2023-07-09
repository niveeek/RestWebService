//@Programador: Ing. Kevin Carlos Lopez Gonzalez
//@Fecha: 02/11/2023
//@Ejercicio: Spring Boot Java
package com.lopez.app.spring.dtos;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
public class UsuarioDTO {
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "CUST_SEQ1")
	@SequenceGenerator(sequenceName = "customer_seq1",allocationSize = 1,name = "CUST_SEQ1")
	private Long id;
	@Email
	@NotEmpty(message = "Correo requerido")
	@Size(max = 50, min=15, message = "El correo no debe exceder 50 caracteres, minimo 15")
	private String correo;
	@NotEmpty(message = "Contrasena requerida")
	private String contrasena;
	//CONSTRUCTOR CON ARGUMENTOS
	public UsuarioDTO(Long id,
			@Email @NotEmpty(message = "Correo requerido") @Size(max = 50, min = 15, message = "El correo no debe exceder 50 caracteres, minimo 15") String correo,
			@NotEmpty(message = "Contrasena requerida") String contrasena) {
		super();
		this.id = id;
		this.correo = correo;
		this.contrasena = contrasena;
	}
	//CONSTRUCTOR VACIO
	public UsuarioDTO() {
		super();
	}
	//GETTERS AND SETTERS
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}