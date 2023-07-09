/*@Programador: Ing. Kevin Carlos López González
 *@Fecha: 02/11/2023
 *@Ejercicio: validaCorreo
 *@Descripcion: crear pantalla con caja de texto y boton que envía el contenido al controller que debe de responder si la cadena es una dirección de correo correcta.
 */
package com.lopez.app.spring.servicios;
import org.springframework.data.repository.CrudRepository;
import com.lopez.app.spring.modelos.Usuario;
public interface UsuarioServicio extends CrudRepository<Usuario,Long>{
	
}