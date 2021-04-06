package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {
	
	public CalculadoraCCC() {
		super("CCC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double constCCC = 2.6964e-4;
		return (constCCC * peso) / (raio * raio * raio);
	}

}