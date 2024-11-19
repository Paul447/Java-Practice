import java.lang.Math;
public class ArrayWithRandom {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i = 0; i<=arr.length-1;i++){
            arr[i] = (int) (1+(Math.random())*99);
        }
        for(int j = 0 ; j<=arr.length - 1 ; j++){
            System.out.println(arr[j]);
        }
    }
}
