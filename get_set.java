package oops;

public class  get_set {
    String name;
    int age;
    String address;
    public get_set( String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        get_set Manju = new get_set("Manju",32,"Royal Court Noida");
        System.out.println(Manju.getName());
        System.out.println(Manju.getAge());
        System.out.println(Manju.getAddress());
    }
}
