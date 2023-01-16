package oops;

import java.util.Scanner;

public class MainBook {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        MyBook newBook= new MyBook();
        String name= scan.nextLine();
        newBook.setTitle(name);
        System.out.println("the title is: "+newBook.getTitle());

    }
}
