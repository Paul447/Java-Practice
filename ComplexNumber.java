import java.util.Scanner;
public class ComplexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st complex number :");
        String s = sc.nextLine();
        // Getting the value of string at index 0
        char c1 = s.charAt(0);
        char c1last = s.charAt(s.length()-2); 
        int i = c1 - '0';
        int j = c1last - '0';

        System.out.print("Enter the 2nd Complex number: ");
        String s2 = sc.nextLine();
        // Getting the value of string at index 0
        char c2 = s2.charAt(0);
        char c2last = s2.charAt(s2.length()-2);
        int i2 = c2 - '0';
        int j2 = c2last - '0';
        // The output of the complex number 
        System.out.print((i+i2) +" + "+(j+j2) +"i" );
        sc.close();
    }
}
