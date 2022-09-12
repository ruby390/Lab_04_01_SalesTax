public class salesTax {
    public static void main(String []args){
        int priceOfPurchase = 15;
        double salesTax = .05;
        System.out.println("What is the price of your purchase?");
        System.out.println("The price is $" + priceOfPurchase);
        double calculatedTax = priceOfPurchase * salesTax;
        System.out.println("the sales tax is $" + calculatedTax);
        double calculatedTotal = priceOfPurchase * salesTax + priceOfPurchase;
        System.out.println("the total price is $" + calculatedTotal);
    }
}
