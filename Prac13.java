import java.util.Scanner;

public class Prac13 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int result = 0,op1,op2;
            int i = 0;

            System.out.print("Enter Equation : ");
            String string = scanner.nextLine();
            String normalizedEqn = string.replaceAll(" ", "");

            if (normalizedEqn.length() < 3) {
                
                throw new Exception("Minimum 2 Opearator and 1 Opearand Required");
            }

            while (normalizedEqn.charAt(i) != '+' && normalizedEqn.charAt(i) != '-' && normalizedEqn.charAt(i) != '*' && normalizedEqn.charAt(i) != '/') {
                i++;
            }
            op1 = Integer.parseInt(normalizedEqn.substring(0, i));
            op2 = Integer.parseInt(normalizedEqn.substring(i + 1, normalizedEqn.length()));
            switch (normalizedEqn.charAt(i)) {
                case '+':
                    result =  op1 + op2;
                    break;
                case '-':
                    result = op1 - op2;
                    break;
                case '*':
                    result = op1 * op2;
                    break;
                case '/':
                    result = op1 / op2;
                    break;
            }

            System.out.println(normalizedEqn.substring(0, i) + ' ' + normalizedEqn.charAt(i) + ' ' + normalizedEqn.substring(i + 1, normalizedEqn.length())
                    + " = " + result);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
