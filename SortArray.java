public class SortArray {
    public static void main(String[] args) {
        int[] arr ={1,5,7,23,4,63,8,3};

        for(int i = 0; i<=arr.length-1; i++ ){
            for(int j=i+1; j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int k=0; k<=arr.length-1;k++ ){
            System.out.println(arr[k]);
        }
    }
}
