package oops.sampleQ10;

public class mainClass {

    public static void main(String[] args) {
        Classroom C1= new Classroom(8237,"sanjana");
        Classroom C2= new Classroom(8233,"surya");
        Classroom C3= new Classroom(8221,"sahil");
        Classroom C4= new Classroom(8246,"pankhuri");
        Classroom.Inner C5= new Classroom.Inner();
        C5.msg();
        System.out.println(C1.getUID()+" "+C1.getName());
        System.out.println(C2.getUID()+" "+C2.getName());
        System.out.println(C3.getUID()+" "+C3.getName());
        System.out.println(C4.getUID()+" "+C4.getName());
        System.out.println("Total numbers of students are: "+Classroom.count);

    }


}
