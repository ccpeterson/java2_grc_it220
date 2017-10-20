package exception;

import java.util.NoSuchElementException;

public class PayrollItem
{
	private String employeeId;
	private double pay;
	
	public PayrollItem (String newEmployeeId, double newPay) 
	{
		if (newEmployeeId == null || newEmployeeId.isEmpty())
		{
			throw new EmptyStringException();
		}
		if (newPay < 0)
		{
			throw new NegativeNumberException();
		}		
		employeeId = newEmployeeId;
		pay = newPay;		
	}
	
	public String getEmployeeId()
	{
		return employeeId;
	}
	
	public double getPay()
	{
		return pay;
	}
	
	public String toString()
	{
		return ("employeeId = " + employeeId + ", pay = " + pay);
	}
}