import java.util.Scanner;
public class Prac3 
{
	public static void main(String[] args) 
	{
		float ft,mt;
		System.out.println("Enter number in meters");
		Scanner scanner = new Scanner(System.in);
		mt = scanner.nextFloat();
		ft = mt * 3.28084f;
		System.out.println("Number in feet "+ft);
	}
}
