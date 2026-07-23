class AmazonAccount{
    private int amazonPayBalance;
    private String accountName;
    
    //Setter
    public void setAmazonPayBalance(int amazonPayBalance){
        this.amazonPayBalance= amazonPayBalance;                    
    }

    //Getter
    public int getAmazonPayBalance(){
        return this.amazonPayBalance;
    }

    public AmazonAccount(int amazonPayBalance,String accountName){
        this.amazonPayBalance=amazonPayBalance;
        this.accountName=accountName;
    }
}

class Encapsulation {
    public static void main(String[] args){
        AmazonAccount priya=new AmazonAccount(200,"Priya");
        priya.setAmazonPayBalance(100);
        System.out.println(priya.getAmazonPayBalance());
        // priya.amazonPayBalance=10;          error: amazonPayBalance has private access in AmazonAccount
    }
}

