package oops;

 class ABC implements Runnable {
     public void run(){
         for (int i = 0; i <6 ; i++) {
             System.out.print("hi ");
         } try {
             Thread.sleep(500);
         }catch (Exception E){
             System.out.print("error");
         }
     }

}
class XYZ implements Runnable{
     public void run(){
         for (int i = 0; i <6 ; i++) {
             System.out.print(" hello");
         } try {
             Thread.sleep(500);
         }catch (Exception E){
             System.out.println("error");
         }
     }
}
