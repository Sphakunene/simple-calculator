package unitTesting;


public class CalculatorApp {
	
	public static void main(String[] args) 
	{
	
	Calculator c = new Calculator();
	
	System.out.println("Sum :"+c.addition(5, 5));
	System.out.println("Subtract :"+c.subtraction(5, 5));
	System.out.println("division :"+c.division(5, 5));
	System.out.println("Multiplication :"+c.multiply(5, 5));
	
	}
}
