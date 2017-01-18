import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		double firstInput = 0;
		double firstNumber = 0;
		double secondNumber = 0;
		String operand = "000";
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("welcome to Calcoolator"
				+ "\npress 1 to start and press 000 anytime to quit application");
		
		firstInput = kb.nextDouble();
		
		while(firstInput != 0)
		{
			
			System.out.println("Please input the 1st number, then the operation, then the last number");
			firstNumber = kb.nextDouble();
			
				if(firstNumber == 000)
				{
				System.out.println("Closing Application");
				System.exit(0);
				}
			
			System.out.println("please input the operand");
			operand = kb.next();
			
			System.out.println("please input the last number");
			secondNumber = kb.nextDouble();
				if(secondNumber == 000)
				{
					System.out.println("Closing Application");
					System.exit(0);
				}
			
			
			System.out.println("TOTAL IS:");
			
			
			
		}
		
		
		
		
		
		Arithmetics ar = new Arithmetics();

	}
	
	

}
