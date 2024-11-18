import java.util.Scanner;
public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want to search in array : ");
        int search = sc.nextInt();
        boolean isnotfind = true;
        int array[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<=array.length-1;i++){
            if(array[i]==search){
                isnotfind = false;
                System.out.println("Yes element is in the array :"+array[i]);
            }
        }
        if(isnotfind){
            System.out.println("Sorry element didn't match with our array :"+search);
        }
        sc.close();
    }
    
}
