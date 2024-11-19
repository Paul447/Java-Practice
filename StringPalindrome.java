import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        int count = 0;
        char [] chars = s.toCharArray();

        for(int i =0; i<=chars.length-1;i++){
            if(chars[i] != chars[chars.length-1-i]){
                break;
            }
            else{
                count++;
            }
        }
        if(count == chars.length){
            System.out.println("The character is palindrome");
        }
        sc.close();
    }
}
