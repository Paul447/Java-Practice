import java.util.Scanner;
import java.lang.Math;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the digit");
        int digit = sc.nextInt();
        int sum = 0;
        digit = Math.abs(digit);
        while(digit > 0){
            sum = sum + (digit % 10);
            digit  = digit/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
