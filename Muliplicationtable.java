import java.util.Scanner;
public class Muliplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to generate muliplication table :");
        int n = sc.nextInt();
        int x = 1;
        while(x<=10){
            System.out.println(n+ " * " + x + " = " + n*x);
            x++;
        }
        sc.close();

    }
    
    
}
