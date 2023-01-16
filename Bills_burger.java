package oops;

public class Bills_burger {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Chicken Hamburger", 3.00, "chicken", "Corn");
        hamburger.addHamburgerAddition1("Cheese", 0.20);
        hamburger.addHamburgerAddition2("Salad", 0.10);
        hamburger.addHamburgerAddition3("Tomato", 0.10);
        hamburger.addHamburgerAddition4("Cucumber", 0.10);
        System.out.println(String.format("Total price: %.2f",hamburger.itemizehamburger()));

        HealthyBurger healthy = new HealthyBurger(3.69, "Vegan");
        healthy.addHealthyAddition1("Salad", 0.10);
        healthy.addHealthyAddition2("Sunflower seeds", 0.20);
        System.out.println("Total price: " + healthy.itemizehamburger());

        DeluxeBurger deluxe = new DeluxeBurger();
        System.out.println("Total price: " + deluxe.itemizehamburger());
    }
}
