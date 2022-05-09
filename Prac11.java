import java.util.Random;

public class Prac11 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0,rows=0;
        int arr[][] = new int[6][6];
        int oddRow[] = new int[6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = random.nextInt(2);
            }
        }
        for (int i = 0; i < 6; i++) {
            count=0;
            for (int j = 0; j < 6; j++) {
                if (arr[i][j]==1) {
                    count++;
                }
            }
            if (count%2!=0) {
                oddRow[i] = 1;
                rows++;
            }
        }
        System.out.println("Total Rows with Odd 1s : "+rows);
        System.out.println("Rows with Odd 1s : ");
        for(int i=0;i<6;i++)
        {
            if (oddRow[i]==1) 
            {
                System.out.print((i+1)+" ");
            }
        }
    }
}
