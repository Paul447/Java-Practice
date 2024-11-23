import java.util.Scanner;
public class UsingFunction {
    public static void sum(int a, int b){
        int add = a+b;
        System.out.println("The sum of "+ a +" + "+b+" = " +add);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any two number :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sum(x, y);
    }
    
}
