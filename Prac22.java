import java.util.Scanner;
class Prac22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Total Number of Integers: ");
        int n = scanner.nextInt();
        System.out.print("Enter Integers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The smallest element is " + smallest(arr));
    }


    static int smallest(int[] arr) {
        int min = arr[arr.length - 1];
        int index = arr.length - 1;
        return min(arr, index, min);
    }
    
    static int min(int[] arr, int index, int min) {
        if (index < 0) {
            return min;
        } else if (arr[index] < min) {
            return min(arr, index - 1, arr[index]);
        } else {
            return min(arr, index - 1, min);
        }
    }
}