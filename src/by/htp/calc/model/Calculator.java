package by.htp.calc.model;

public class Calculator {

	public void greetUser() {
		System.out.println("Hello! Enter 2 value (String|int|double) and operation");
	}

	//--------- int_operations ------
	
	public int multiply(int x, int y) {
		int result = x * y;
		return result;
	}

	public int divide(int x, int y) {
		int result = x / y;
		return result;
	}

	public int minus(int x, int y) {
		int result = x - y;
		return result;
	}

	public int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	//--------- double_operations ------
	
	public double multiply(double x, double y) {
		double result = x * y;
		return result;
	}

	public double divide(double x, double y) {
		double result = x / y;
		return result;
	}

	public double minus(double x, double y) {
		double result = x - y;
		return result;
	}

	public double plus(double x, double y) {
		double result = x + y;
		return result;
	}
	
	public double performOperation(String operation, double value1, double value2) {
		double result = 0.0;
		switch (operation) {
		case "*":
			result = multiply(value1, value2);
			break;
		case "/":
			result = divide(value1, value2);
			break;
		case "-":
			result = minus(value1, value2);
			break;
		case "+":
			result = plus(value1, value2);
			break;
		}
		return result;
	}

	public int performOperation(String operation, int value1, int value2) {
		int result = 0;
		switch (operation) {
		case "*":
			result = multiply(value1, value2);
			break;
		case "/":
			result = divide(value1, value2);
			break;
		case "-":
			result = minus(value1, value2);
			break;
		case "+":
			result = plus(value1, value2);
			break;
		}
		return result;
	}
	
	public String performOperation(String operation, String value1, String value2) {
		String result = value1 + operation + value2;
		return result;
	}
}
