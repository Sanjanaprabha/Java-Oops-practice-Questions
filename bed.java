package oops;

public class bed {
    private String style;
    private int pillows;
    private int quilt;
    private int height;
    private int sheets;
    public bed(String style,int pillows,int quilt,int height, int sheets){
        this.style=style;
        this.pillows=pillows;
        this.quilt=quilt;
        this.height=height;
        this.sheets=sheets;
    }
    public static void Make(){
        System.out.println("Bed is being Made");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }
}
