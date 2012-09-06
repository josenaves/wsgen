package com.josenaves;

import net.webservicex.ConvertTemperature;
import net.webservicex.ConvertTemperatureSoap;
import net.webservicex.TemperatureUnit;

import com.parasoft.wsdl.calculator.Calculator;
import com.parasoft.wsdl.calculator.ICalculator;

public class WebservicesClient {

	public static void main(String[] args) {

		System.out.println("Testando webservice Calculator...");
		ICalculator calcService = new Calculator().getICalculator();

		System.out.println("add(1.2, 1.8)");
		float resultado = calcService.add(1.2f, 1.8f);
		System.out.println("Resultado = " + resultado);

		System.out.println("subtract(3f, 1.5f)");
		resultado = calcService.subtract(3f, 1.5f);
		System.out.println("Resultado = " + resultado);
		
		
		System.out.println("-------");
		
		System.out.println("Testando webservice de conversão de temperatura...");
		ConvertTemperatureSoap tempService = new ConvertTemperature().getConvertTemperatureSoap();
		System.out.println("convertTemp(30, celsius, fahrenheit)");
		double temp = tempService.convertTemp(30, TemperatureUnit.DEGREE_CELSIUS, TemperatureUnit.DEGREE_FAHRENHEIT);
		System.out.println("Resultado = " + temp);
	}
}
