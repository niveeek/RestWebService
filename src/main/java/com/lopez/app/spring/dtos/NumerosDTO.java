/*@Programador: Ing. Kevin Carlos López González
 *@Fecha: 02/11/2023
 *@Ejercicio: nummeros
 *@Descripcion: método get La respuesta debe de ser una lista de 10 números aleatorios simulando que se obtienen de base de datos.
 *@Ejercicio: paresImpares
 *@Descripcion: método post al que le envías una lista de números y la respuesta debe de ser dos listas una con números pares y una con los impares.
 */
package com.lopez.app.spring.dtos;
import java.util.List;
public class NumerosDTO {
	//LISTA
	List<Integer> numeros, pares, impares;
	//CONSTRUCTOR PRINCIPAL
	public NumerosDTO(List<Integer> numeros, List<Integer> pares, List<Integer> impares) {
		super();
		this.numeros = numeros;
		this.pares = pares;
		this.impares = impares;
	}
	//CONSTRUCTOR VACIO
	public NumerosDTO() {
		super();
		
	}
	//GETTERS AND SETTERS
	public List<Integer> getNumeros() {
		return numeros;
	}
	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	public List<Integer> getPares() {
		return pares;
	}
	public void setPares(List<Integer> pares) {
		this.pares = pares;
	}
	public List<Integer> getImpares() {
		return impares;
	}
	public void setImpares(List<Integer> impares) {
		this.impares = impares;
	}
}