import java.util.Scanner;
class Prac4{
	public static void main(String args[])
	{
		double kg,pounds,meters,inch,bmi;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Weight in Pounds");
		pounds = scanner.nextDouble();
		System.out.println("Enter Height in Inches");
		inch = scanner.nextDouble();
		
		kg =  pounds / 2.205;
		meters = inch / 39.37;
		bmi = (kg)/(meters*meters);
		System.out.println("BMI Index "+bmi);
		
	} 
}