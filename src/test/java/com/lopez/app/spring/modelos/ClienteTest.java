package com.lopez.app.spring.modelos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void test() {
		assertEquals(Cliente.class, returnObject().getClass());
	}
	private Cliente returnObject() {
		Cliente bean = new Cliente();
		bean.setApellidoMaterno(null);
		bean.setApellidoPaterno(null);
		bean.setCorreo(null);
		bean.setEdad(null);
		bean.setId(null);
		bean.setNombre(null);
		bean.getApellidoMaterno();
		bean.getApellidoPaterno();
		bean.getCorreo();
		bean.getEdad();
		bean.getId();
		bean.getNombre();
		return bean;
	}

}
