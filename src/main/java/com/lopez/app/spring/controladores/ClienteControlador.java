/*@Programador: Ing. Kevin Carlos López González
 *@Fecha: 02/11/2023
 *@Ejercicio: registraUsuario
 *@Descripcion: crea una pantalla con un formulario. Esta información deberá de ser guardada en una tabla llamada TAUSUARIOSTEST
después de dar clic al boton de guardar deberá de regresar el id que se creó para este usuario.
 */
package com.lopez.app.spring.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lopez.app.spring.modelos.Cliente;
import com.lopez.app.spring.servicios.ClienteServicio;
@RestController
@RequestMapping("/guardarCliente")
@CrossOrigin(origins = "*")
public class ClienteControlador {
	//DEPENDENCIA
	@Autowired
	private ClienteServicio clienteServicio;
	//PETICION
	@PostMapping
	public Long guardarCliente(@RequestBody Cliente cliente) {
		Cliente c = clienteServicio.save(cliente);
		return c.getId();
	}
}