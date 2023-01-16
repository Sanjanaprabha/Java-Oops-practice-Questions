package oops;

public class HealthyBurger extends Hamburger{
    public HealthyBurger( double price, String meat) {
        super("healthy burger", price, meat, "multi-grain");
    }
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1price;
    private double healthyExtra2price;

    public void addHealthyAddition1(String healthyExtra1Name,double healthyExtra1price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1price=healthyExtra1price;
    }
    public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2price=healthyExtra2price;
    }

    @Override
    public double itemizehamburger() {
        double totalPrice = super.itemizehamburger();
        if (healthyExtra1Name != null) {
            System.out.println(this.healthyExtra1Name + " added for extra price of " + this.healthyExtra1price);
            totalPrice +=healthyExtra1price;
        }
        if (healthyExtra2Name != null) {
            System.out.println(this.healthyExtra2Name + " added for extra price of " + this.healthyExtra2price);
            totalPrice += healthyExtra2price;
        }
        return totalPrice;
    }

}
