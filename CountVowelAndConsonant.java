import java.util.Scanner;
public class CountVowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();
        s.toLowerCase();
        int vowel =0;
        int consonant = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i<=chars.length-1;i++){
            if(chars[i] == 'a' || chars[i] =='e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] =='u'){
                vowel++;
            }else{
                consonant++;
            }

        }
        System.out.print(vowel+" Vowels and "+consonant+" Consonants ");
    }
}
