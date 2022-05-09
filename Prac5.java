import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Prac5
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Enter number of elements in Array");
		n = scanner.nextInt();	
		Integer arr[] = new Integer[n];
		System.out.println("Enter Elements of Array");
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+i+" element : ");
			arr[i] = scanner.nextInt();
			System.out.println();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<n;i++)
		{
			System.out.println(i+" element : "+arr[i]);
		}
	}
}