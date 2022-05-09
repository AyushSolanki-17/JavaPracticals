import java.util.Scanner;
class EquationSolver{
    float a,b,c,d,e,f,x,y,ans1,ans2;
    EquationSolver()
    {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter Co-Efficient of X of Equation 1 (a) :");
        a = scanner.nextFloat();
        System.out.println("Enter Co-Efficient of Y of Equation 1 (b) :");
        b = scanner.nextFloat();
        System.out.println("Enter Solution of Equation 1 (e) :");
        e = scanner.nextFloat();
        System.out.println("Enter Co-Efficient of X of Equation 2 (c) :");
        c = scanner.nextFloat();
        System.out.println("Enter Co-Efficient of Y of Equation 2 (d) :");
        d = scanner.nextFloat();
        System.out.println("Enter Solution of Equation 2 (f) :");
        f = scanner.nextFloat();
        scanner.close();
    }
    void CalculateXY()
    {
        this.x = ((e*d)-(b*f))/((a*d)-(b*c));
        this.y = ((a*f)-(e*c))/((a*d)-(b*c));
    }
    void PrintXY()
    {
        this.CalculateXY();
        System.out.println("Value of X : "+x);
        System.out.println("Value of Y : "+y);
    }
}
public class Prac2 
{
    public static void main(String[] args) {
        EquationSolver equationSolver = new EquationSolver();
        equationSolver.PrintXY();
    }
}
