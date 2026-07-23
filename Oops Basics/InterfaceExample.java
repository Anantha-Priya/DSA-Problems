interface BiCycle{
    void hasBasket();
    void horn();

    default void getNumberPlate(){
        System.out.println("Number");
    }
}

class ElectricBicycle implements BiCycle{
    @Override 
    public void hasBasket(){
        System.out.println("No Basket");
    }
    public void increaseSpeed(){
        System.out.println("Increased by 2!!!!!!");
    }
    public void increaseSpeed(int input){
        System.out.println(input);
    }

    @Override
    public void horn(){
        System.out.println("Electric Horn!!!!!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        ElectricBicycle elec= new ElectricBicycle();
        elec.horn();
        elec.increaseSpeed();
        elec.increaseSpeed(4);
    }
}
