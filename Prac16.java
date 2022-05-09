import java.util.Scanner;
public class Prac16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        String decimal = input.nextLine();
        int indexOfDecimal = decimal.indexOf(".");
        int len = decimal.substring(indexOfDecimal).length();
        int integer = (int) Math.pow(10, len - 1);
        int fractional = (int) (Double.parseDouble(decimal) * integer);
        Fraction fr = new Fraction(integer,fractional);
        System.out.println("The Fraction Number is " + fr);
    }
}

class Fraction {
    int integer;
    int fractional;

    Fraction(int i, int f) {
        integer = i;
        fractional = f;
    }

    public long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Override
    public String toString() {
        long gcd = gcd(integer, fractional);
        return (fractional / gcd) + "/" + (integer / gcd);
    }
}