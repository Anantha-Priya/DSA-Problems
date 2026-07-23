public class firstOccurence {
    public static void main(String[] args) {
        int arr[]={6,4,387,5,8,387};
        int flag=0;
        int n=387;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                  flag=i;
            //    break;    if we give break then it will print first occurence else print last occurence.
            }
        }
        System.out.print(flag);
    }
}
