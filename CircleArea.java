import java.util.Scanner;
import java.lang.Math;
public class CircleArea{
    public static void main(String[] args) {
        final double PI = 3.1429;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the radius of circle :");
        double a = sc.nextDouble();
        double area =  PI*Math.pow(a,2);
        System.out.println("The area of circle is :"+area );
        sc.close();
    }
}
    