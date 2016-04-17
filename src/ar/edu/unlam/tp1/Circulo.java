package ar.edu.unlam.tp1;

public class Circulo {
	
	private Double radio;
	
	public void definirRadio(Double radio) {
		this.radio = radio;
	}
	
	public Double conocerRadio() {
		return this.radio;
	}
	
	public Double calcularPerimetro() {
		return Math.PI * 2 * this.conocerRadio().doubleValue();
	}
	
	public Double calcularArea() {
		return Math.PI * Math.pow(this.conocerRadio().doubleValue(), 2);
	}
}
