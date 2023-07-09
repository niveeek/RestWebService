/*@Programador: Ing. Kevin Carlos López González
 *@Fecha: 02/11/2023
 *@Ejercicio: creaArchivo
 *@Descripcion: método post que recibe un array de persona y que se cree un archivo único de texto llamado personas.txt en el cual cada elemento del array sea una línea de texto separado por pipe.
 */
package com.lopez.app.spring.modelos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
@Table(name = "persona")
public class Persona {
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "CUST_SEQ2")
	@SequenceGenerator(sequenceName = "customer_seq2",allocationSize = 1,name = "CUST_SEQ2")
	@Column(name="id")
	private Long id;
	@NotEmpty(message = "Nombre requerido")
	@Size(max = 10, min = 5, message = "El nombre no debe exceder 10 caracteres, minimo 5")
	@Column(name = "nombre")
	private String nombre;
	@NotEmpty(message = "Apellido paterno requerido")
	@Size(max = 10, min = 5, message = "El apellido paterno no debe exceder 10 caracteres, minimo 5")
	@Column(name = "apellidoPaterno")
	private String apellidoPaterno;
	@NotEmpty(message = "Apellido materno requerido")
	@Size(max = 10, min = 5, message = "El apellido materno no debe exceder 10 caracteres, minimo 5")
	@Column(name = "apellidoMaterno")
	private String apellidoMaterno;
	@NotNull(message = "Edad es requerida")
	@Size(max = 2, min = 1, message = "La edad no debe exceder 2 caracteres, minimo 1")
	@Column(name = "edad")
	private Integer edad;
	//CONSTRUCTOR CON ATRIBUTOS
	public Persona(Long id,
			@NotEmpty(message = "Nombre requerido") @Size(max = 10, min = 5, message = "El nombre no debe exceder 10 caracteres, minimo 5") String nombre,
			@NotEmpty(message = "Apellido paterno requerido") @Size(max = 10, min = 5, message = "El apellido paterno no debe exceder 10 caracteres, minimo 5") String apellidoPaterno,
			@NotEmpty(message = "Apellido materno requerido") @Size(max = 10, min = 5, message = "El apellido materno no debe exceder 10 caracteres, minimo 5") String apellidoMaterno,
			@NotNull(message = "Edad es requerida") @Size(max = 2, min = 1, message = "La edad no debe exceder 2 caracteres, minimo 1") Integer edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
	}
	//CONSTRUCTOR VACIO
	public Persona() {
		super();
	}
	//GETTERS AND SETTERS
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
}