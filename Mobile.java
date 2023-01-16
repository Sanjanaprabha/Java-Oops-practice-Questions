package oops;

public class Mobile {
    private int prize;
    private String camera;
    private String model;

    public Mobile(int prize, String camera, String model) {
        this.prize = prize;
        this.camera = camera;
        this.model = model;
    }

    public int getPrize() {
        return prize;
    }

    public String getCamera() {
        return camera;
    }

    public String getModel() {
        return model;
    }
}
