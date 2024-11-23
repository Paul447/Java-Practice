public class StopWatch {
    private long startTime;
    private long endTime;
    StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long TimeElasped(){
        return endTime - startTime;
    }
    public long startTime(){
        return startTime;
    }
    public long endTime(){
        return endTime;
    }
    public static void main(String[] args) {
        StopWatch s = new StopWatch();
        int [] arr = new int[100];

        // Creating the random number 
        for(int i = 0;i<arr.length;i++){
            int x = (int) (1+Math.random()*100); 
            arr[i] = x;
        }
        System.out.println();
        System.out.println("Array Before sorting");
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] +",");
        }


        for(int i = 0 ;i<arr.length-1;i++){
            for (int j = i+1 ; j<arr.length-1 ;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        s.stop();
        System.out.println();
        System.out.println();

        System.out.println("Time when started :" + s.startTime);
        System.out.println("Time when ended : "+ s.endTime );
        System.err.println("Time taken to sort array : "+s.TimeElasped());
        System.out.println();

        System.out.println("Array after sorting:");

        for(int k = 0 ; k<arr.length-1 ;k++){
            System.out.print(arr[k]+",");
        }

    }

}
