package oops;

public class MainThread {
    public static void main(String[] args) {
        Runnable A1=new ABC();
        Runnable A2 =new XYZ();
        Thread T1= new Thread(A1);
        Thread T2 = new Thread(A2);
        System.out.println("these are odd ");
        T1.start();
        System.out.println("these are even ");
        T2.start();

    }
}
