/*@Programador: Ing. Kevin Carlos López González
 *@Fecha: 02/11/2023
 *@Ejercicio: nummeros
 *@Descripcion: método get La respuesta debe de ser una lista de 10 números aleatorios simulando que se obtienen de base de datos.
 *@Ejercicio: paresImpares
 *@Descripcion: método post al que le envías una lista de números y la respuesta debe de ser dos listas una con números pares y una con los impares.
 */
package com.lopez.app.spring.controladores;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lopez.app.spring.daos.NumerosDao;
import com.lopez.app.spring.servicios.NumerosServicio;
@RestController
@RequestMapping("/numeros")
public class NumerosControlador {
	//DEPENDENCIA
	@Autowired
	NumerosServicio numerosServicio;
	//PETICIONES
	@GetMapping
	public ResponseEntity<List<Integer>> numerosControlador(){
		return new ResponseEntity<>(this.numerosServicio.getNumerosServicio(),HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<NumerosDao> numerosParesImpares(@RequestBody List<Integer> lista){
		NumerosDao numerosDao = new NumerosDao();
		numerosDao.calculo(lista);
		numerosDao.getPares();
		return new ResponseEntity<>(numerosDao, HttpStatus.OK);
	}
}