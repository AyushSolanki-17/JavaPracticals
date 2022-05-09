import java.util.Scanner;
class Prac6
{
	public static void main(String[] args)
	{
		char c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a letter");
		c = scanner.next().charAt(0);
		c = Character.toLowerCase(c);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonent");
		}
	}
}