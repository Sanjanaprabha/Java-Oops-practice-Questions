package oops;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe",14.10, "chips", "drink");
        super.addHamburgerAddition1("drink",3.0);
        super.addHamburgerAddition2("chips",2.0);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Prize) {
        System.out.println("No additional items can be added to deluxe");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Prize) {
        System.out.println("No additional items can be added to deluxe");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Prize) {
        System.out.println("No additional items can be added to deluxe");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Prize) {
        System.out.println("No additional items can be added to deluxe");
    }

}
