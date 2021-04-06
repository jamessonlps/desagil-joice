package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {
	
	public CalculadoraCFC() {
		super("CFC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double constCFC = 2.93648997e-4;
		return (constCFC * peso) / (raio * raio * raio);
	}

}

