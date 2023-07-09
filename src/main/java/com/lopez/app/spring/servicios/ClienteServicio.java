/*@Programador: Ing. Kevin Carlos López González
 *@Fecha: 02/11/2023
 *@Ejercicio: registraUsuario
 *@Descripcion: crea una pantalla con un formulario. Esta información deberá de ser guardada en una tabla llamada TAUSUARIOSTEST
después de dar clic al boton de guardar deberá de regresar el id que se creó para este usuario.
 */
package com.lopez.app.spring.servicios;
import org.springframework.data.repository.CrudRepository;
import com.lopez.app.spring.modelos.Cliente;
public interface ClienteServicio extends CrudRepository<Cliente, Long>{
	
}