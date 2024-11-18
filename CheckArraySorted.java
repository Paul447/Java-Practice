// Check the 
public class CheckArraySorted {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8,9};
        int arr[] = {9,8,7,6,5,4,3,2,1};

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i=0; i<=arr.length-2 ; i++){
            if(arr[i]<arr[i+1]){
                isAscending = true;
            }
            else{
                isAscending = false;
                break;
            }

            if(arr[i]>arr[i+1]){
                isDescending = true;
            }
            else{
                isDescending = false;
                break;
            }

        }
        if(isAscending){
            System.out.println("The array is in Ascending order");
        }else{
            System.out.println("Array is not in Ascending order");
        }

        if(isDescending){
            System.out.println("The array is in Descending order");
        }
        else{
            System.out.println("Array is not in Descending order");
        }
    }
}
