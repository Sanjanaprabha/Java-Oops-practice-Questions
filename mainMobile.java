package oops;

public class mainMobile {
    public static void main(String[] args) {
        Mobile new_mobile= new Mobile(9000,"dual camera 35,120 megapixel","redmi 10");
        System.out.println(new_mobile.getModel());
        System.out.println(new_mobile.getCamera());
        System.out.println(new_mobile.getPrize());
    }
}
