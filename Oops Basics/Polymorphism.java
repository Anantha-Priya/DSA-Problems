
//METHOD OVERRIDING- means redefining a method in the child class that already exists in the parent class
                   // with the same method name, same parameters, and same return type.

class BiCycle{
    void model(){
        System.out.println("Its a Normal BiCycle");
    }
}

class ElectricBicycle extends BiCycle{
    @Override void model(){
        System.out.println("Its a Electric Bicycle");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        BiCycle BC= new ElectricBicycle();            //Reference type = BiCycle , Actual object = ElectricBicycle
        BC.model();
    }
}
