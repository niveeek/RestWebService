/*@Programador: Ing. Kevin Carlos López González
 *@Fecha: 02/11/2023
 *@Ejercicio: nummeros
 *@Descripcion: método get La respuesta debe de ser una lista de 10 números aleatorios simulando que se obtienen de base de datos.
 *@Ejercicio: paresImpares
 *@Descripcion: método post al que le envías una lista de números y la respuesta debe de ser dos listas una con números pares y una con los impares.
 */
package com.lopez.app.spring.servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lopez.app.spring.daos.NumerosDao;
@Service
public class NumerosServicio {
	//DEPENDENCIA
	@Autowired
	NumerosDao numerosDAO;
	//METODO
	public List<Integer> getNumerosServicio(){
		return this.numerosDAO.getNumerosDao();
	}
}
