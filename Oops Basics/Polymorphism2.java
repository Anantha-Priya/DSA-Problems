
//METHOD OVERLOADING -means having multiple methods with same name but different parameters in the same class.

class BiCycle {

    // Method 1
    void model() {
        System.out.println("Its a Normal BiCycle");
    }

    // Method 2 (Overloaded)
    void model(String type) {
        System.out.println("Its a " + type + " BiCycle");
    }

    // Method 3 (Overloaded)
    void model(String type, int gears) {
        System.out.println("Its a " + type + " BiCycle with " + gears + " gears");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {

        BiCycle BC = new BiCycle();

        BC.model();
        BC.model("Electric");
        BC.model("Mountain", 21);
    }
}
