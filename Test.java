package cr.go.ucr.test;

import static org.junit.jupiter.api.Assertions.*;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;

class Test {
	
	@org.junit.jupiter.api.Test
	void testGetSuma() {
		 OperacionAritmetica context;
	       context = new OperacionAritmetica( new Sumar());
		assertEquals(context.procesar(2, 3),5);
	}
	
	@org.junit.jupiter.api.Test
	void testGetSumaNegativo() {
		OperacionAritmetica context;
	       context = new OperacionAritmetica( new Sumar());
		assertEquals(context.procesar(-3, 2),-1);
	}
	
	@org.junit.jupiter.api.Test
	void testGetResta() {
		 OperacionAritmetica context;
	       context = new OperacionAritmetica( new Resta());
		assertEquals(context.procesar(2, 1),1);
	}
	
	@org.junit.jupiter.api.Test
	void testGetRestaNegativo() {
		OperacionAritmetica context;
	       context = new OperacionAritmetica( new Resta());
		assertEquals(context.procesar(-4, 3),-1);
	}
	
	@org.junit.jupiter.api.Test
	void testGetRestaDigitoMayor() {
		OperacionAritmetica context;
	       context = new OperacionAritmetica( new Resta());
		assertEquals(context.procesar(3, 4),-2);
	}
	
	@org.junit.jupiter.api.Test
	void testGetRestaCero() {
		OperacionAritmetica context;
	       context = new OperacionAritmetica( new Resta());
		assertEquals(context.procesar(1, 1),0);
	}
	
	@org.junit.jupiter.api.Test
	void testGetMultiplicacion() {
		 OperacionAritmetica context;
	       context = new OperacionAritmetica( new Multiplicacion());
		assertEquals(context.procesar(7, 4),28);
	}
	
	@org.junit.jupiter.api.Test
	void testGetMultiplicacionNegativo() {
		OperacionAritmetica context;
	       context = new OperacionAritmetica( new Multiplicacion());
		assertEquals(context.procesar(-8, 2),-1);
	}
	
	@org.junit.jupiter.api.Test
	void testGetDivision() {
		 OperacionAritmetica context;
	       context = new OperacionAritmetica( new Division());
		assertEquals(context.procesar(5, 1),5);
	}
	
	@org.junit.jupiter.api.Test
	void testGetDivisionNegativo() {
		OperacionAritmetica context;
	       context = new OperacionAritmetica( new Division());
		assertEquals(context.procesar(-4, 3),-1);
	}
	
	@org.junit.jupiter.api.Test
	void testGetDivisionCero() {
		OperacionAritmetica context;
	       context = new OperacionAritmetica( new Division());
		assertEquals(context.procesar(5, 0),-3);
	}



}
