package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraCCCTest {

	private Calculadora calc;
	private static double TOLERANCIA = 0.05;
	
	@Test
	public void testCalculadoraCCC() {
		calc = new CalculadoraCCC();
		assertEquals(8.57, calc.calcula(92.91, 0.143), TOLERANCIA);
		assertEquals(19.28, calc.calcula(183.84, 0.137), TOLERANCIA);
		assertEquals(0.53, calc.calcula(6.94, 0.152), TOLERANCIA);
	}

}
