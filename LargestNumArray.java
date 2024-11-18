public class LargestNumArray {
    public static void main(String[] args) {
        int arr[] = {1,5,9,10,11,6};
        int initialnumber = arr[0];
        for(int i = 0 ; i<=arr.length-1 ;i++){
            if(initialnumber<arr[i]){
                initialnumber = arr[i];
            }
        }
        System.out.println(initialnumber);
    }
}
