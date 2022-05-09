import java.util.Scanner;
class Prac8
{
	public static void main(String args[])
	{
		int div=2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = scanner.nextInt();
		while(number > 1)
  		{
			if(number%div==0)
			{
				System.out.print(div+" ");
    			number=number/div;
   			}
   			else
   			{
    			div++;
   			}
  		}
	}
}