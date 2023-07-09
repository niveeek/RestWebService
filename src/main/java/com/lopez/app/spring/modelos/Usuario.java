/*@Programador: Ing. Kevin Carlos López González
 *@Fecha: 02/11/2023
 *@Ejercicio: validaCorreo
 *@Descripcion: crear pantalla con caja de texto y boton que envía el contenido al controller que debe de responder si la cadena es una dirección de correo correcta.
 */
package com.lopez.app.spring.modelos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "CUST_SEQ1")
	@SequenceGenerator(sequenceName = "customer_seq1",allocationSize = 1,name = "CUST_SEQ1")
	@Column(name="id")
	private Long id;
	@Email
	@NotEmpty(message = "Correo requerido")
	@Size(max = 50, min=15, message = "El correo no debe exceder 50 caracteres, minimo 15")
	@Column(name = "correo")
	private String correo;
	@NotEmpty(message = "Contrasena requerida")
	@Column(name = "contrasena")
	private String contrasena;
	public Usuario(Long id,
			@Email @NotEmpty(message = "Correo requerido") @Size(max = 50, message = "No debe exceder 50 caracteres") String correo,
			@NotEmpty(message = "Contrasena requerida") String contrasena) {
		super();
		this.id = id;
		this.correo = correo;
		this.contrasena = contrasena;
	}
	public Usuario() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
}