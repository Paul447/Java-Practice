import java.util.Scanner;
public class FinancialPearson {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity rate :");
        double x = sc.nextDouble();
        double y =  sc.nextDouble();
        double gar = (double) y/x;
        double total = x + gar;
        System.out.println("The total number is :"+total); 
        sc.close();
    }
}
