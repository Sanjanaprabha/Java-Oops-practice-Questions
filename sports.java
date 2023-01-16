package oops;

 class sports {
    String getname(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in "+getname());
    }
}
class Soccer extends sports{
    @Override
    String getname() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in "+getname());
    }
}

   class MainSports{
       public static void main(String[] args) {
           sports C1=new sports();
           System.out.println(C1.getname());
           C1.getNumberOfTeamMembers();
           Soccer C2=new Soccer();
           System.out.println(C2.getname());
           C2.getNumberOfTeamMembers();
       }
   }
