//@Programador: Ing. Kevin Carlos Lopez Gonzalez
//@Fecha: 02/11/2023
//@Ejercicio: Spring Boot Java
package com.lopez.app.spring.excepciones;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.lopez.app.spring.dtos.ErrorDTO;
@ControllerAdvice
public class UsuarioExcepcion extends ResponseEntityExceptionHandler{
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException manve,HttpHeaders hh, HttpStatusCode hsc, WebRequest wr) {
	    List<FieldError> errores = manve.getBindingResult().getFieldErrors();
	    Object obj;
	    if(errores.stream().anyMatch(error -> error.getField().equals("correo"))) {
	        ErrorDTO rcDTO = new ErrorDTO();
	        rcDTO.setError("El correo no es valido");
	        obj = rcDTO;
	    }else {
	        List<String> errores2 = errores.stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
	        obj = errores2;
	    }
	    return new ResponseEntity<>(obj, hh, hsc);
	}
}