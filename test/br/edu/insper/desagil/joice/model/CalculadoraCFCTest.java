package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraCFCTest {

	private Calculadora calc;
	private static double TOLERANCIA = 0.05;
	
	@Test
	public void testCalculadoraCFC() {
		calc = new CalculadoraCFC();
		assertEquals(8.89, calc.calcula(63.55, 0.128), TOLERANCIA);
		assertEquals(19.36, calc.calcula(196.97, 0.144), TOLERANCIA);
		assertEquals(10.60, calc.calcula(107.87, 0.144), TOLERANCIA);
	}

}