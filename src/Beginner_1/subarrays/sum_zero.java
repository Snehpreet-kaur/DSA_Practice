package Beginner_1.subarrays;
/*Write a program to print starting and ending indexes of all the subarrays of arr[] whose sum is equal to zero.
If no valid subarray exists whose sum is zero then print -1.
Print all the indexes in increasing order of the starting index and if
starting index is the same then print in the increasing order of the ending index.*/
import java.util.*;
public class sum_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0,c=0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                if(sum==0){
                    System.out.println("Subarray found from Index "+i+" to "+j);
                    c++;
                }
            }
        }
        if(c==0){
            System.out.println(-1);
        }
    }
}
