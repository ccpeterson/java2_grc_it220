package console_io;

import java.util.Scanner;

public class UserInputs 
{
	private static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{		
		//prompt, then request a value
		int op1 = getNumber("Enter a number: ");
		int op2 = getNumber("Enter a number: ");
		
		System.out.println("Enter an operator: ");
		String operator = console.nextLine();
		
		System.out.println(op1 + " " + operator + " " + op2);
	}
	private static int getNumber(String prompt)
	{
		System.out.println(prompt);
		int value = console.nextInt();
		console.nextLine();
		return value;
	}
}