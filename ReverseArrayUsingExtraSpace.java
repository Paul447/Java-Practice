// Reverser the array using extra space in java
public class ReverseArrayUsingExtraSpace {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        int arry[] = new int[arr.length];
        System.out.print("Array Before reverse :");
        for(int i = 0; i<=arr.length-1;i++){
            System.out.print(arr[i]);
            arry[i] = arr[arr.length-1-i];
            if(i==arr.length-1){
                break;
            }
            else{
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.print("Array after reverse :");

        for(int j = 0;j<=arry.length-1;j++){
            System.out.print(arry[j]);
            if(j == arr.length-1){
                break;
            }
            else{
                System.out.print(",");
            }
            
        }
    }
    
}
