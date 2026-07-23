//Storing custom objects in Collections.


import java.util.ArrayList;

class Data{
    int id;
    String name;
    String department;
    int salary;
    Data(int id, String name,String department, int salary){         //constructor
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
}

public class arrayListExample2 {
    public static void main(String[] args){
        //Creating an ArrayList of Data objects
        ArrayList<Data> stringArrayList = new ArrayList<>();
        Data data = new Data(12, "Priya", "CSE", 100000);   
        stringArrayList.add(data);

        System.out.println(stringArrayList.get(0).id);
        System.out.println(stringArrayList.get(0).name);
        System.out.println(stringArrayList.get(0).department);
        System.out.println(stringArrayList.get(0).salary);
    }
}
