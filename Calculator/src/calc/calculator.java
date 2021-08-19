package calc;
import java.util.Scanner;

public class calculator 
{

	public static void main(String[] args) 
	{
		System.out.println("This is a small calculator written for practice. "
				+ "It has a number of functions, such as addition, subtraction, multiplication, division.");
		System.out.println("DO YOU want to run a calculator?");
		System.out.println("YES or NO?");
		
		Scanner scan = new Scanner(System.in);
		
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("YES"))
		{
			boolean logicOfSwicth = true;
			while (logicOfSwicth == true)
			{
				System.out.print("Enter the first digit number: ");
				int numberFirst = scan.nextInt();
				
				System.out.print("Enter the second digit number: ");
				int numberSecond = scan.nextInt();
				
				System.out.print("Enter an operation with numbers: ");
				char operation = scan.next().charAt(0);
				
				switch (operation)
				{
					case '+':
					{
						System.out.println(String.format("%d + %d = %d", numberFirst, numberSecond, numberFirst + numberSecond));
						logicOfSwicth = clientSurvey();
						break;
					}
				
					case '-':
					{
						System.out.println(String.format("%d - %d = %d", numberFirst, numberSecond, numberFirst - numberSecond));
						logicOfSwicth = clientSurvey();
						break;
					}
					
					case '*':
					{
						System.out.println(String.format("%d * %d = %d", numberFirst, numberSecond, numberFirst * numberSecond));
						logicOfSwicth = clientSurvey();
						break;
					}
					
					case '/':
					{
						System.out.println(String.format("%d / %d = %.2f", numberFirst, numberSecond, numberFirst * 1.0 / numberSecond));
						logicOfSwicth = clientSurvey();
						break;
					}
					
					default:
					{
						logicOfSwicth = clientSurvey();
					}
				}
			}
		}
		else
		{
			System.out.print("Bye honey;)");
		}
	}
	
	public static boolean clientSurvey()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Wrong actions, will you try again?");
		System.out.println("YES or NO?");
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("YES"))
		{
			boolean logicOfSwicth = true;
			return logicOfSwicth;
		}
		else
		{
			return false;
		}
	}
}
