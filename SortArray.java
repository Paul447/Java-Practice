public class SortArray {
    public static void main(String[] args) {
        int[] arr ={5,1,7,23,4,63,8,3}; // Initialize the array 

        for(int i = 0; i<=arr.length-1; i++ ){ //Start a upper loop to select the specific element 
            for(int j=i+1; j<=arr.length-1;j++){ // Iterate the loop through the array to check the speicfic element smaller than that exist after that element
                if(arr[i]>arr[j]){ // Check that condition for first item of array
                    System.out.println(arr[i]+","+arr[j]);
                    int temp = arr[i];  // If smaller item exist store the bigger number into specific variable 
                    arr[i] = arr[j];    // Smaller element exist then the previous element set them to the i index 
                    arr[j] = temp;      // Change the element exist in the i index with j which will change the position of the small one with big one 
                }
            }
        }
        for(int k=0; k<=arr.length-1;k++ ){
            System.out.println(arr[k]);// Printing the array
        }
    }
}
