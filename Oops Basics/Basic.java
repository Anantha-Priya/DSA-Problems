
class Human{                         
    int age;
    String name;
    
    //WITH PARAMETER
    boolean hasMobile(boolean input){
        return input;
    }
    int ageAfter25(){
          return age+25;
    }

    void ageBefore10(){
        System.out.println(age-10);
    }

    static String getInitial(){
         return "R";
    }
}


class Basic {
    public static void main(String[] args){

      System.out.println(Human.getInitial());

       Human priya=new Human();       //priya is an object which is created
       priya.age=21;
       priya.name="Nanthu";
    //    Human bala=new Human();
    //    bala.age=19;
    //    bala.name="Balu";
       boolean priyaMobile=true;         //variable
    //    //boolean priyaMobile= priya.hasMobile();
       boolean priyaHasMobile= priya.hasMobile(priyaMobile);
       int priyaAgeAfter25= priya.ageAfter25();
       priya.ageBefore10();
    //    System.out.println(priya.age);
    //    System.out.println(priya.name);
       System.out.println(priyaHasMobile);
       System.out.println(priyaAgeAfter25);
    //    System.out.println(bala.name);
    //    System.out.println(bala.age);

    }
    
}