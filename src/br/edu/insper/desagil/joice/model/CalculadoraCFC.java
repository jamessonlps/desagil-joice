package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {
	
	public CalculadoraCFC() {
		super("CFC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		return (2.93648997e-4 * peso) / (raio * raio * raio);
	}

}

