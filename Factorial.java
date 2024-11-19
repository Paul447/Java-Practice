import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int fact = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            fact+=i;
        }
        System.out.println(fact);
    }
}
