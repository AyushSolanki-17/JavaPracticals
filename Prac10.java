import java.util.Scanner;
class Prac10
{
	public static void reverse(int numbers[])
	{
		int j=0,temp;
		while(j<=numbers.length/2)
		{
   			temp=numbers[j];
   			numbers[j]=numbers[numbers.length-1-j];
   			numbers[numbers.length-1-j]=temp;
   			j++;
  		}
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter "+(i+1)+" element : ");
			arr[i] = scanner.nextInt();
			System.out.println();
		}
		reverse(arr);
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
	}
}