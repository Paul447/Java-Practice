public class AP {
    public static void main(String[] args) {
        int [] arr = {3,6,1,0,1,4,2};
        int x = 0;
        for(int i = 0; i<arr.length;i=i+2)
        {
            x = x+arr[i];
        }
        System.out.println(x);
    }
    
}
