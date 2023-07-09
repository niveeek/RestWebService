/*@Programador: Ing. Kevin Carlos López González
 *@Fecha: 02/11/2023
 *@Ejercicio: nummeros
 *@Descripcion: método get La respuesta debe de ser una lista de 10 números aleatorios simulando que se obtienen de base de datos.
 *@Ejercicio: paresImpares
 *@Descripcion: método post al que le envías una lista de números y la respuesta debe de ser dos listas una con números pares y una con los impares.
 */
package com.lopez.app.spring.daos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class NumerosDao {
	//LISTA
	List<Integer> numeros, pares, impares;
	//CONSTRUCTOR PRINCIPAL
	public NumerosDao(List<Integer> numeros, List<Integer> pares, List<Integer> impares) {
		super();
		this.numeros = numeros;
		this.pares = pares;
		this.impares = impares;
	}
	//CONSTRUCTOR PERSONALIZADO
	public NumerosDao() {
		this.numeros = new ArrayList<>();
		this.pares = new ArrayList<>();
		this.impares = new ArrayList<>();
		for(int k = 0; k<10; k++) {
			this.numeros.add((int)(Math.random()*(100+1)));
		}
	}
	//GETTERS AND SETTERS
	public List<Integer> getNumeros() {
		return numeros;
	}
	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	public List<Integer> getPares() {
		return this.pares;
	}
	public void setPares(List<Integer> pares) {
		this.pares = pares;
	}
	public List<Integer> getImpares() {
		return this.impares;
	}
	public void setImpares(List<Integer> impares) {
		this.impares = impares;
	}
	//METODO OBTENER NUMEROS
	public List<Integer> getNumerosDao(){
		return this.numeros;
	}
	//METODO CALCULAR NUMERO PAR/IMPAR
	public void calculo(List<Integer> numeros) {
		for(Integer n: numeros) {
			if(n%2 == 0) {
				this.pares.add(n);
			}else {
				this.impares.add(n);
			}
		}
	}
}