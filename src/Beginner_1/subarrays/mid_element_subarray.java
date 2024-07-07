package Beginner_1.subarrays;
/*You are given an integer array Arr of size N. You need to print all the subarrays whose sum is greater
 than the middle element in the array.*/
import java.util.*;
public class mid_element_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int i,j,k,sum=0,m;
        for(i=0;i<N;i++){
            for(j=i;j<N;j++){
                sum=0;
                for(k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                if(sum>arr[N/2]){
                    for(m=i;m<=j;m++){
                        System.out.print(arr[m]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
