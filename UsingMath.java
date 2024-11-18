import java.lang.Math;
import java.util.Scanner;
public class UsingMath {

    public static void main(String[] args) {
        // Generate the random number in java 
        int a = (int) (1+ (Math.random())*99);
        System.out.println(a);

        // Using power funtion in java
        int power = (int) Math.pow(2,3);
        System.out.println(power);

        //Get the maximum number using java it only works with the two integer
        int max  = (int) Math.max(1,4);
        System.out.println(max);

        //Get the minium number using java it only works with the two integer
        int min = (int) Math.min(23,54);
        System.out.println(min);

        // Get the nearest integer in java
        System.out.print("Enter the floating value :");
        Scanner sc = new Scanner(System.in);
        float near = sc.nextFloat();
        int nearest = (int) Math.round(near);
        System.out.println(nearest);

        // Get the Square Root of the input number 
        System.out.print("Enter the value get the squareroot  :");
        double sq = sc.nextDouble();
        double squareRoot = Math.sqrt(sq);
        System.out.println(squareRoot);

        // Get the absolute value of the input number 
        System.out.print("Enter the negative value :");
        double abs = sc.nextDouble();
        double absvalue = Math.abs(abs);
        System.out.println(absvalue);
        sc.close();
    }
}