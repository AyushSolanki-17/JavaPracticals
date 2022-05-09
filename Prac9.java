import java.util.Scanner;
class Prac9
{
	public static int gcd(int num1, int num2)
	{
		if(num2==0)
			return num1;
		return gcd(num2,num1%num2);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num1,num2,gcd;
		System.out.println("Enter First Number : ");
		num1 = scanner.nextInt();
		System.out.println("Enter Second Number : ");
		num2 = scanner.nextInt();
		gcd = gcd(num1,num2);
		System.out.println("GCD("+num1+","+num2+")"+" = "+gcd);
	}
}