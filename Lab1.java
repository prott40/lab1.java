/**
* Lab1.java
* <Preston Rottinghaus / Section: 02B/ Day: Thursday/ Time: 3:30-5:20pm>
*
* This program gets two numbers as doubles from the user
* then displays their average to two decimal places
*/
import java.util.Scanner;

public class Lab1{
public static void main(String[] args)
{

Scanner s = new Scanner(System.in);
String input; // read in user input as a string
/*
double average;


System.out.print("Enter first number: "); // user prompt
input = s.nextLine();
double num1 = Double.parseDouble(input);
System.out.print("Enter second number: "); // user prompt
input = s.nextLine();
double num2 = Double.parseDouble(input);
average = ((num1 + num2)/2);// calculate the avg of the two numbers
// display the average using println
System.out.println("The average is " + average);
// display the average w/2 decimals using printf
System.out.printf("The average is %.2f\n", average);
// display the average w/2 decimals using String.format
String output = String.format("The average is %.2f\n", average);
System.out.printf(output);

*/
	
		System.out.print("Enter the Tip % be used asa decimal (Ex: 18% would be .18):");
		input = s.nextLine();
		double tip = Double.parseDouble(input);
		System.out.print("Enter total bill amount:");
		input = s.nextLine();
		double bill = Double.parseDouble(input);
			tip  = (bill * tip);
			bill = (bill + tip);
		System.out.printf("Total tip amount = $%.2f",tip);
		System.out.println();
		System.out.printf("Total bill amount = $%.2f", bill);
		
	
		s.close();
	
} // end main
} // end class Lab1



