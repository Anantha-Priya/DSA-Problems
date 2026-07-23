class BiCycle{
    private String numberPlate;

    BiCycle(String numberPlate) {                     //Constructor
        this.numberPlate=numberPlate;
    }

    public String getNumberPlate(){
        return this.numberPlate;
    }
    
    public void horn(){
        System.out.println("Horn!!!!!!");
    }
}

class ElectricBicycle extends BiCycle{
    private String version;
    ElectricBicycle(String numberPlate, String version){
        super(numberPlate);
        this.version=version;
    }
}

class PedalBicycle extends BiCycle{
    PedalBicycle(String numberPlate){
        super(numberPlate);
    }

    public void pushFaster(){
        System.out.println("PushFaster!!!!!!!!");
    }
}
public class Inheritance {
    public static void main(String[] args){
        ElectricBicycle elec= new ElectricBicycle("EB1203","v2");
        System.out.println(elec.getNumberPlate());
        PedalBicycle pdl=new PedalBicycle("PD2345");
        System.out.println(pdl.getNumberPlate());
        pdl.pushFaster();
    }
}
