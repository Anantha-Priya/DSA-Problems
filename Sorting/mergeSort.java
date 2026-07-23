// TC- 0(n log n)

import java.util.*;
public class mergeSort{
    public static void MergeSort(int[] a,int left,int right){
        if(left<right){
        int mid=left+(right-left)/2;
        MergeSort(a,left,mid);
        MergeSort(a,mid+1,right);
        merge(a,left,mid,right);
        }
    }
    public static void merge(int []a,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int L1[]=new int[n1];
        int L2[]=new int[n2];

        for(int i=0;i<n1;i++){
            L1[i]=a[left+i];
        }
        for(int i=0;i<n2;i++){
            L2[i]=a[mid+1+i];
        }

        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(L1[i]<L2[j]){
                a[k]=L1[i];
                i++;
            }
            else{
               a[k]=L2[j];
               j++;
            }
            k++;
        }

        while(i<n1){
            a[k]=L1[i];
            i++;
            k++;
        }

        while(j<n2){
            a[k]=L2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        int arr[]={4,6,3,7,8};
        int left=0;
        int right=arr.length-1;
        MergeSort(arr,left,right);
        System.out.println(Arrays.toString(arr));
    }
}