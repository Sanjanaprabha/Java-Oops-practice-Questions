package oops.sampleQ10;

abstract class Students {
    int UID;
 String Name;

 Students(int UID, String Name){
     this.UID = UID;
     this.Name=Name;
 }
    public String getName(){return Name;}
    public int getUID(){return UID;}
}
class Classroom extends Students{
    public static Integer count=0;
    Classroom(int UID, String Name) {
        super(UID, Name);
        count++;
    }

    static class Inner{
        void msg(){System.out.println("welcome to the classroom");
        }

    }

}


