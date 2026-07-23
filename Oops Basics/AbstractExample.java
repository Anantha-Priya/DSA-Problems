abstract class BiCycle{
    abstract void hasBasket();
} 

class ElectricBicycle extends BiCycle{
    @Override 
    public void hasBasket(){
        System.out.println("No Basket");
    }
}

class PedalBicycle extends BiCycle{
    @Override 
    public void hasBasket(){
        System.out.println("Has Basket");
    }
}


public class AbstractExample {
    public static void main(String[] args) {
        ElectricBicycle elec= new ElectricBicycle();
        elec.hasBasket();
    }
}
