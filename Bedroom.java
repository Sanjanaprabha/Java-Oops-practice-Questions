package oops;

public class Bedroom {
    private String Name;
    private Wall1 wall1;
    private Wall1 wall2;
    private Wall1 wall3;
    private Wall1 wall4;
    private bed  Bed;
    private Ceiling ceiling;
    private Lamp lamp;

    public Bedroom(String Name, Wall1 wall1, Wall1 wall2,
                   Wall1 wall3, Wall1 wall4, bed Bed, Ceiling ceiling, Lamp lamp) {
        this.Name = Name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.Bed = Bed;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed(){
        System.out.println("Bedroom making bed");
        bed.Make();
    }
}
