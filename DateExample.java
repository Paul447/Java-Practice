import java.util.Date;
public class DateExample {
    public static void main(String[] args) {
        Date d  = new Date();
        long [] time   = {
            10000,
            100000,
            1000000,
            10000000,
            100000000,
            1000000000,
            10000000000L,
            100000000000L,
            1000000000000L,
        };
        for (int i = 0 ; i< time.length;i++){
            d.setTime(time[i]);
            System.out.println("Elapsed time : "+time[i]+" Date is : "+d.toString());
        }
    }
}
