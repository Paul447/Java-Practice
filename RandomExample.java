import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random r = new Random(10000);
        for(int i = 1; i<=50;i++){
            System.out.println(r.nextInt(100));
        }
    }
}
