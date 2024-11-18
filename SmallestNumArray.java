public class SmallestNumArray {
    public static void main(String[] args) {
        int arr[] = {1,0,-1,4,3,9,12,8};
        int min = arr[0];
        for(int i = 0; i<=arr.length-1 ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
