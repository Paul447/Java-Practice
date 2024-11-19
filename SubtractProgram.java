import java.util.Scanner;
import java.lang.Math;
public class SubtractProgram {
    public static void main(String[] args) {
        int x = (int) (1+(Math.random())*99);
        int y = (int) (1+(Math.random())*99);
        int sub = x-y;
        int in;
        Scanner sc = new Scanner(System.in);
        System.out.print(x +" - " + y + " = " );
        in = sc.nextInt();

        while(sub != in){
            System.out.println("Try again !!");
            System.out.print(x +" - " + y + " = " );
            in = sc.nextInt();
        }

        System.out.println("Kudos!! Right Answer !!");
        sc.close();
    }
}
