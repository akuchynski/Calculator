package by.htp.calc.input;

import java.util.Scanner;

@SuppressWarnings("resource")
public class ConsoleInput {

	public String readValue() {
		String value;
		Scanner sc = new Scanner(System.in);
		System.out.println("value:");
		value = sc.next();
		return value;
	}

	public String readOperation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("operation:");
		String value = sc.next();
		return value;
	}
}
