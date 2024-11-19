public class ArrayShifiting {
    public static void main(String[] args) {
        int [] arr = {1,5,23,5,2,6,8,2,9,7};
        int temp = arr[0];
        for(int i = 1; i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int j=0; j<arr.length;j++){
            System.out.println(arr[j] + ",");
        }
    }
 
}
