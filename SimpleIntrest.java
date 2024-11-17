import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        int p = sc.nextInt();
        System.out.print("Enter the Time : ");
        int t = sc.nextInt();
        System.out.print("Enter the Rate : ");
        int r = sc.nextInt();
        double SI = (p*t*r)/100;
        System.out.println("The Simple Intrest is : "+ SI);
        sc.close();
    }
}
