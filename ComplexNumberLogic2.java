import java.util.Scanner;
public class ComplexNumberLogic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first real number :");
        int real1 = sc.nextInt();
        System.out.print("Enter the first imaginary number :");
        int imaginary1 = sc.nextInt();
        System.out.print("Enter the first real number :");
        int real2 = sc.nextInt();
        System.out.print("Enter the first imaginary number :");
        int imaginary2 = sc.nextInt();

        int realsum = real1+real2;
        int imaginarysum = imaginary1+imaginary2;

        System.out.println(realsum +" + "+imaginarysum +"i");

    }
}
