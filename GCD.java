import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a first number :");
        int x = sc.nextInt();
        System.out.print("Enter a 2nd number :");
        int y = sc.nextInt();
        int i;
        if(x>y){
            i=y;
        }
        else{
            i = x;
        }
        for(int j=i; j>0;j--){
            if(x%j==0 && y%j==0){
                System.out.println("The GCD is :"+j);
                break;
            }
        }
        sc.close();
    }
    
}
