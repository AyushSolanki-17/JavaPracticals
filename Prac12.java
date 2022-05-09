import java.util.Random;
public class Prac12 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 100; i++) {
            System.out.print(random.nextInt(49)+" ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
