public class Account {
    private int id ;
    private double balance;
    private double annualIntrestRate;

    Account(){
        this.id = 0;
        this.balance = 0;
    }
    Account(int id , int balance, double intrestRate){
        this.id = id;
        this.balance = balance;
        this.annualIntrestRate = intrestRate;
    }

    public double getMonthlyIntrest(){
        double monthlyIntrest = balance*((annualIntrestRate/12.0)/100.0);
        return monthlyIntrest;
    }

    public void withDraw(int amount){
        balance =  balance - amount;
    }

    public void deposit(int amount){
        balance  = balance + amount;

    }
    public static void main(String[] args) {
        Account ac  =  new Account(1122,20000,4.5);
        System.out.println(ac.getMonthlyIntrest());
        ac.withDraw(2500);
        System.out.println(ac.balance);
        System.out.println(ac.getMonthlyIntrest());

        ac.deposit(3000);
        System.out.println(ac.balance);
        System.out.println(ac.getMonthlyIntrest());
        
    }

    


}
