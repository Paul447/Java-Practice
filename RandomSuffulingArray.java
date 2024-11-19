import java.lang.Math;
public class RandomSuffulingArray {
    public static void main(String[] args) {
        int [] arr = {1,6,3,5,43,24,5,12};
        for(int i=0;i<=arr.length-1;i++){

            int j = (int)(Math.random()*arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k]+" , ");
        }
    }
   
    
}
