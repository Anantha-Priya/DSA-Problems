public class fisrtAndSecondSmallestNum {
    public static void main(String[] args) {
        int [] arr={2,3,5,6,1,90};
        int firstMin=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<firstMin){
                secondMin=firstMin;
                firstMin=num;
            }
            else if (num<secondMin && num!=firstMin){
                secondMin=num;
            }
        }
        System.out.println(firstMin+" "+secondMin);
    } 
}
