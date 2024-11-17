import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number:");
        int a = sc.nextInt();
        System.out.print("Enter the Second number:");
        int b = sc.nextInt();
        System.out.println("Values before swap "+a+" and "+b);

        int c = a;
        a = b ;
        b = c;
        System.out.println("Values after swap "+a+" and "+b);
        sc.close();
    }
}
