
public class FooCorp {

	public static int CalculatePay(int hoursWorked, 
			double basePay) {
	double totalPay = 0.0;
	
	//Check that base pay is not more than $8.00
	if (basePay < 8.00)
	{
		System.out.println("$" + basePay +" is less than the minimum" 
				+ " wage of $8.00");
		
		return 0;
	}
	//Check that the employee hasn't worked more than 60 hours
	else if (hoursWorked > 60)
	{
		System.out.println("This person has worked too many hours");
		
		return 0;
	}
	
	
	//Pay Calculations
	if (hoursWorked > 40)
	{
		totalPay += basePay * 40;
		totalPay += (basePay * 1.5) * (hoursWorked - 40);
	}
	else
	{
		totalPay += basePay * hoursWorked;
	}
	
	//Print the total pay
	System.out.println("Total Pay: $" + totalPay);
	
	
	return 1;
	}
	
	public static void main(String[] args) {
		
		CalculatePay(35, 7.50);
		CalculatePay(47, 8.20);
		CalculatePay(73, 10.0);
	
	}
}
