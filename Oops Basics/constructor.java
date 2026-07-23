
class AmazonAccount{
   String accountName;
   int amazonPayBalance;

   
   public AmazonAccount(){
         System.out.println("Constructor called succesfully when creating a new Object");
   }
   public AmazonAccount(int amazonPayBalance, String name){
        this.amazonPayBalance = amazonPayBalance;
        this.accountName = name;
   }
   public AmazonAccount(String name){
        this.accountName = name;
   }
//    public AmazonAccount(String nickName){    
//            //since the AmazonAccount(string name) is already defined in the above constructor so two constructor with same parameter can't be called
//         this.accountName = nickName;      
//    }
}

public class constructor {
    public static void main(String[] args) {
        AmazonAccount priya = new AmazonAccount(200,"Priya");
        AmazonAccount pinky = new AmazonAccount("Pinky");
        System.out.println(priya.amazonPayBalance);
        System.out.println(priya.accountName);
        System.out.println(pinky.accountName);

    }
}
