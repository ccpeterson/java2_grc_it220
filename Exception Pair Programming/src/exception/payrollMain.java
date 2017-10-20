package exception;

import java.util.Scanner;

public class payrollMain {

	private static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		newHire();
	}

	private static void newHire() 
	{
		try
		{		
			System.out.println("Enter an employee ID");
			String tempID = console.nextLine();
			System.out.println("Entere a pay amount");
			double tempPay = console.nextInt();
			PayrollItem payroll1 = new PayrollItem(tempID,tempPay);
			System.out.println("PayrollItem:  " + payroll1.toString());
		}
		catch (EmptyStringException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch (NegativeNumberException ex)
		{
			System.out.println(ex.getMessage());
		}		
	}
}