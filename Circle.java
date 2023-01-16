package oops;

class Circle {
    private double radius;
    public Circle(double radius){
        if(radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }

    public double getVolume() {
        return 4*getArea()*getRadius() ;
    }
}
class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle radius = " + circle.getRadius());
        System.out.println("circle area = " + circle.getArea());

        Sphere sphere = new Sphere(5.5);
        System.out.println("sphere volume = " + sphere.getVolume());
    }
}
