/*@Programador: Ing. Kevin Carlos López González
 *@Fecha: 02/11/2023
 *@Ejercicio: creaArchivo
 *@Descripcion: método post que recibe un array de persona y que se cree un archivo único de texto llamado personas.txt en el cual cada elemento del array sea una línea de texto separado por pipe.
 */
package com.lopez.app.spring.controladores;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lopez.app.spring.modelos.Persona;
@RestController
@RequestMapping("/crearArchivo")
@CrossOrigin(origins = "*")
public class PersonaControlador {
	//ATRIBUTO
	private String ruta="C:\\Users\\kevin\\OneDrive\\Escritorio\\persona.txt";
	//PETICION
	@PostMapping
	public String crearArchivo(@RequestBody Persona[] persona) {
			Archivo(persona);
			return "Archivo .txt creado con exito en: "+ruta;
	}
	//METODO
		public void Archivo(Persona[] persona) {
		try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(ruta))) {
		    for (Persona p: persona) {
		        bw.write(String.format("%s|%s|%s|%d\n", 
		        		p.getNombre(), 
		        		p.getApellidoPaterno(), 
		        		p.getApellidoMaterno(), 
		        		p.getEdad()));
		    }
		}catch (IOException e) {
		    e.printStackTrace();
		}
	}
}