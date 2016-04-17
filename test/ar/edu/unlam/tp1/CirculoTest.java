package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo circuloRadio2 = new Circulo();
		circuloRadio2.definirRadio(2.00);
		
		assertEquals(circuloRadio2.conocerRadio().doubleValue(), 2.00, 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo circuloRadio3Punto7 = new Circulo();
		circuloRadio3Punto7.definirRadio(3.70);
		
		assertEquals(circuloRadio3Punto7.conocerRadio().doubleValue(), 3.70, 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo circuloRadio5 = new Circulo();
		circuloRadio5.definirRadio(5.00);
		
		assertEquals(circuloRadio5.conocerRadio().doubleValue(), 5.00, 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo circuloRadio10Punto9 = new Circulo();
		circuloRadio10Punto9.definirRadio(10.90);
		
		assertEquals(circuloRadio10Punto9.conocerRadio().doubleValue(), 10.90, 0.01);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es61Punto57() {
		Circulo circuloRadio9punto8 = new Circulo();
		circuloRadio9punto8.definirRadio(9.80);
		
		assertEquals(circuloRadio9punto8.calcularPerimetro(), 61.57, 0.01);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto69() {
		Circulo circuloRadio16Punto6 = new Circulo();
		circuloRadio16Punto6.definirRadio(16.60);
		
		assertEquals(circuloRadio16Punto6.calcularArea(), 865.69, 0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
