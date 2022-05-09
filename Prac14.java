import java.util.ArrayList;
import java.util.Date;
public class Prac14 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(new Loan(50000.0, 12.5));
        arrayList.add(new Date());
        arrayList.add(new String("Ayush Solanki"));
        arrayList.add(new Circle(25.0));
        for (Object object : arrayList) {
            System.out.println(object.toString());
        }
    }
}
class Loan {
    double amount,rate;
    public Loan(double amount,double rate) {
        this.amount = amount;
        this.rate = rate;
    }
    @Override
    public String toString() {
        return new String("Amount : "+this.amount+" Rate :"+this.rate+"%");
    };
}

class Circle{
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return new String("Radius of Circle : "+this.radius);
    };
}
