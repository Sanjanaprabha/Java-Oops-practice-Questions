package oops;

import java.util.Scanner;

public class grocery {
    private  static Scanner scan = new Scanner(System.in);
    private static Grocerieslist grocerieslist = new Grocerieslist();
    public static void main(String[] args) {
        boolean quit = false;

        System.out.println("1. show grocery list. \n" +
                "2. Add item in your list.\n" +
                "3. modify item in your list.\n" +
                "4. remove item from your list.\n" +
                "5. check item in your list" +
                "any other key to Exit.");
        System.out.println("enter choice: ");
        while (!quit) {


            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    grocerieslist.PrintList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    search();
                    break;
                default:
                    quit = true;
            }


        }
    }
    public static void addItem(){
        System.out.println("enter item name ");
        grocerieslist.addGrocery(scan.nextLine());
    }
    public static void modify(){
        System.out.println("enter item number ");
        int num= scan.nextInt();
        System.out.println("enter item to be removed ");
        String replace = scan.nextLine();
        grocerieslist.ModifyList(num-1,replace);
    }
    public static void search(){
        System.out.println("enter element you want to check");
        grocerieslist.finditem(scan.nextLine());
    }
    public static void remove(){
        System.out.println("enter item you want to remove ");
        int num= scan.nextInt();
        System.out.println("enter item to be removed ");
        String Name = scan.nextLine();
        grocerieslist.removeitem(num,Name);
    }
}
