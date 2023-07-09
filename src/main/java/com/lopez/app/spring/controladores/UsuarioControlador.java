//@Programador: Ing. Kevin Carlos Lopez Gonzalez
//@Fecha: 02/11/2023
//@Ejercicio: Spring Boot Java
package com.lopez.app.spring.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lopez.app.spring.dtos.ExitoDTO;
import com.lopez.app.spring.modelos.Usuario;
import com.lopez.app.spring.servicios.UsuarioServicio;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/validacionUsuario")
@CrossOrigin(origins = "*")
public class UsuarioControlador {
	//DEPENDIENTE
	@Autowired
	private UsuarioServicio usuarioServicio;
	//PETICIONES
	@PostMapping
	public ResponseEntity<ExitoDTO> validaUsuario(@Valid @RequestBody Usuario usuario) {
		ExitoDTO exitoDTO  = new ExitoDTO();
		exitoDTO.setExito("El correo es valido");
		usuarioServicio.save(usuario);
		return new ResponseEntity<>(exitoDTO, HttpStatus.OK);
	}
}