import java.util.Scanner;
public class FahrenheitToCelsius{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in degree Fahrenheit :");
        double f = sc.nextDouble();
        double c = (5.0/9.0)*(f-32);
        System.out.println(f+" Degree Fahrenheit : "+c+"Degree Celsius");
        sc.close();
    }
}