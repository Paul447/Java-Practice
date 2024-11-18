// Reversing the array without using extra array space
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        for(int i = 0;i<=arr.length/2;i++){
            int temp = arr[i];
            arr[i] =arr[arr.length-1-i];
            arr[arr.length - 1 - i] = temp;
        }
        for(int j=0;j<=arr.length-1; j++){
            System.out.print(arr[j]);
        }
    }
}
