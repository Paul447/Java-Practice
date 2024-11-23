public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    Stock(String symbol, String name ){
        this.symbol = symbol;
        this.name = name;
    }


    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }


    public void setPreviousPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }
    public double getPreviousclosingprice(){
        return previousClosingPrice;
    }



    public double getChangePercent(){
        return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
    }
    public static void main(String[] args) {
        Stock s = new Stock("ORCL","Orcale Cooperation");
        s.setCurrentPrice(34.35);
        s.setPreviousPrice(34.5);
        
        System.out.println("Symbol :" + s.symbol );
        System.out.println("Name :" + s.name);
        System.out.println("Previous price :" + s.getPreviousclosingprice());
        System.out.println("Current Price :" + s.getCurrentPrice());
        System.out.println("Change Percentage :"+s.getChangePercent());

    }

}
