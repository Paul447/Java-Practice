import java.util.Scanner;

public class Subtarct {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the positive integer :");
        //Taking the input in java
        int a = sc.nextInt();

        System.out.print("Please enter the positive integer :");
        //Taking the input in java
        int b = sc.nextInt();

        int sub =  a-b;
        //Using concatenation to display the input and output in single line
        System.out.println("The sum of "+a+" and "+b+" is "+sub);
        sc.close();
    }
    
}
