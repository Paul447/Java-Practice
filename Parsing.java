import java.util.Scanner;
public class Parsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Floating Value :");
        float val = sc.nextFloat();
        System.out.print("Float value to Integer "+(int)val);
        sc.close();

    }
}
