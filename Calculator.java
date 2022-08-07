package com.orthofx;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char op, con;
		Double num1, num2, res;
		
		Scanner input = new Scanner(System.in);
		
		do {
			
			
			System.out.println("Choose an operator : +, -, *, /, %");
			op = input.next().charAt(0);
			
			System.out.println("Enter first number");
			num1 = input.nextDouble();
			
			System.out.println("Enter second number");
			num2 = input.nextDouble();
			
			switch (op) {
			
				case '+':
					res = num1 + num2;
					System.out.println(num1 + " + " + num2 + " = " + res);
					break;
				
				case '-':
					res = num1 - num2;
					System.out.println(num1 + " - " + num2 + " = " + res);
					break;
				
				case '*':
					res = num1 * num2;
					System.out.println(num1 + " x " + num2 + " = " + res);
					break;
				
				case '/':
					res = num1 / num2;
					System.out.println(num1 + " / " + num2 + " = " + res);
					break;
				
				case '%':
					res = num1 % num2;
					System.out.println(num1 + " % " + num2 + " = " + res);
					break;
			
				default:
					System.out.println("Invalid operator");
					break;
			}
			
			System.out.println("Do you want to try again?(y/n)");
			con = input.next().charAt(0);

			
		}while(con == 'y' || con == 'Y');
		
				
		input.close();
	}
}
