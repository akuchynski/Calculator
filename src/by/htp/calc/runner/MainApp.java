package by.htp.calc.runner;

import by.htp.calc.input.ConsoleInput;
import by.htp.calc.model.Calculator;

public class MainApp {

	public static void main(String[] args) {

		String valueS1;
		String valueS2;
		String resultS;
		
		int valueI1;
		int valueI2;
		int resultI;
		
		double valueD1;
		double valueD2;
		double resultD;

		Calculator calc = new Calculator();
		ConsoleInput input = new ConsoleInput();

		calc.greetUser();
		
		valueS1 = input.readValue();
		valueS2 = input.readValue();
		
		try {
			
			valueD1 = Double.parseDouble(valueS1);
			valueD2 = Double.parseDouble(valueS2);
			
			if(valueD1 == (int)valueD1 && valueD2 == (int)valueD2){
				
				valueI1 = (int)valueD1;
				valueI2 = (int)valueD2;
				
				String operation = input.readOperation();
				resultI = calc.performOperation(operation, valueI1, valueI2);
				System.out.println(resultI);
				
			} else {
				
				String operation = input.readOperation();
				resultD = calc.performOperation(operation, valueD1, valueD2);
				System.out.println(resultD);
				
			}

		} catch (NumberFormatException e) {

			String operation = input.readOperation();
			resultS = calc.performOperation(operation, valueS1, valueS2);
			System.out.println(resultS);
		}
	}
}
