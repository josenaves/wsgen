package com.josenaves;

import com.josenaves.wsclient.Calculator;
import com.josenaves.wsclient.ICalculator;

public class WebservicesClient {

	public static void main(String[] args) {

		System.out.println("Testa webservice Calculator...");
		ICalculator calcService = new Calculator().getICalculator();

		System.out.println("add(1.2, 1.8)");
		float resultado = calcService.add(1.2f, 1.8f);
		System.out.println("Resultado = " + resultado);

		System.out.println("subtract(3f, 1.5f)");
		resultado = calcService.subtract(3f, 1.5f);
		System.out.println("Resultado = " + resultado);
		
	}
}
