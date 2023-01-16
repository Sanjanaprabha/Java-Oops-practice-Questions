package oops;

public class Hamburger {
    private String name;
    private double price;
    private String meat;
    private String breadRollType;

    public Hamburger(String name, double price, String meat, String breadRollType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1price;
    private double addition2price;
    private double addition3price;
    private double addition4price;

    public void addHamburgerAddition1(String addition1Name,double addition1price){
        this.addition1Name=addition1Name;
        this.addition1price=addition1price;
    }
    public void addHamburgerAddition2(String addition2Name,double addition2price){
        this.addition2Name=addition2Name;
        this.addition2price=addition2price;
    }
    public void addHamburgerAddition3(String addition3Name,double addition3price){
        this.addition3Name=addition3Name;
        this.addition3price=addition3price;
    }
    public void addHamburgerAddition4(String addition4Name,double addition4price){
        this.addition4Name=addition4Name;
        this.addition4price=addition4price;
    }
    public double itemizehamburger(){
        double totalPrice = this.price;
        System.out.println(this.name + " with " + this.breadRollType + " bread and " + this.meat + " meat. Price: " + this.price);
        if (addition1Name != null) {
            System.out.println(this.addition1Name + " added for extra price of " + this.addition1price);
            totalPrice +=addition1price;
        }
        if (addition2Name != null) {
            System.out.println(this.addition2Name + " added for extra price of " + this.addition2price);
            totalPrice += addition2price;
        }
        if (addition3Name != null) {
            System.out.println(this.addition3Name + " added for extra price of " + this.addition3price);
            totalPrice += addition3price;
        }
        if (addition4Name != null) {
            System.out.println(this.addition4Name + " added for extra price of " + this.addition4price);
            totalPrice += addition4price;
        }
        return totalPrice;
    }
}
