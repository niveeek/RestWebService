/*@Programador: Ing. Kevin Carlos López González
 *@Fecha: 02/11/2023
 *@Ejercicio: registraUsuario
 *@Descripcion: crea una pantalla con un formulario. Esta información deberá de ser guardada en una tabla llamada TAUSUARIOSTEST
después de dar clic al boton de guardar deberá de regresar el id que se creó para este usuario.
 */
package com.lopez.app.spring.dtos;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
public class ClienteDTO {
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "CUST_SEQ3")
	@SequenceGenerator(sequenceName = "customer_seq3",allocationSize = 1,name = "CUST_SEQ3")
	private Long id;
	@NotEmpty(message = "Nombre requerido")
	@Size(max = 10, min = 5, message = "El nombre no debe exceder 10 caracteres, minimo 5")
	private String nombre;
	@NotEmpty(message = "Apellido paterno requerido")
	@Size(max = 10, min = 5, message = "El apellido paterno no debe exceder 10 caracteres, minimo 5")
	private String apellidoPaterno;
	@NotEmpty(message = "Apellido materno requerido")
	@Size(max = 10, min = 5, message = "El apellido materno no debe exceder 10 caracteres, minimo 5")
	private String apellidoMaterno;
	@NotNull(message = "Edad es requerida")
	private Integer edad;
	@Email
	@NotEmpty(message = "Correo requerido")
	@Size(max = 50, min=15, message = "El correo no debe exceder 50 caracteres, minimo 15")
	private String correo;
	//CONSTRUCTOR CON ARGUMENTOS
	public ClienteDTO(Long id,
			@NotEmpty(message = "Nombre requerido") @Size(max = 10, min = 5, message = "El nombre no debe exceder 10 caracteres, minimo 5") String nombre,
			@NotEmpty(message = "Apellido paterno requerido") @Size(max = 10, min = 5, message = "El apellido paterno no debe exceder 10 caracteres, minimo 5") String apellidoPaterno,
			@NotEmpty(message = "Apellido materno requerido") @Size(max = 10, min = 5, message = "El apellido materno no debe exceder 10 caracteres, minimo 5") String apellidoMaterno,
			@NotNull(message = "Edad es requerida") Integer edad,
			@NotEmpty(message = "Correo requerido") @Size(max = 50, min = 15, message = "El correo no debe exceder 50 caracteres, minimo 15") String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
		this.correo = correo;
	}
	//CONSTRUCTOR VACIO
	public ClienteDTO() {
		super();
	}
	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
}