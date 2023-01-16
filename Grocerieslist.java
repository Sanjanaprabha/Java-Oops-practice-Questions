package oops;

import java.util.ArrayList;

public class Grocerieslist {
    //declaring a list;
    private ArrayList<String> listofGrocery = new ArrayList<>();
    public void addGrocery(String item){
        listofGrocery.add(item);
    }
    public void PrintList(){
        System.out.println("your Grocery List has "+listofGrocery.size()+" item.");
        for(int i=0;i<listofGrocery.size();i++){
            System.out.println((i+1)+". "+listofGrocery.get(i));
        }
    }
    public void ModifyList(int position,String item){
        listofGrocery.set(position, item);
        System.out.println("grocery item "+item+" has been added to the list.");
    }

    public void removeitem(int position, String name){
        String item = listofGrocery.get(position);
        listofGrocery.remove(position);
    }

    public void finditem(String searchitem){
        boolean init = listofGrocery.contains(searchitem);
        if (init){
            System.out.println(searchitem+" is in the list.");
        }
    }

}
