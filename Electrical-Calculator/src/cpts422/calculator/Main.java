package cpts422.calculator;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		while (true)
		{
			System.out.print("Enter expression: ");
			
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			
			
			Expression exp = new Expression(line);
			System.out.println(exp.Evaluate());
			//scanner.close();
		}
	}
}
