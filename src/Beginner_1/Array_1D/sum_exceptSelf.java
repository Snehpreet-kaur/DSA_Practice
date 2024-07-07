package Beginner_1.Array_1D;
/*Given an array of n integers where n > 1, return an array output such that output[i] is equal to the sum of
all the elements of nums except nums[i]. All integers in array are greater than 0.*/
import java.util.*;
public class sum_exceptSelf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    sum=sum+arr[j];
                }
            }
            arr1[i]=sum;
            sum=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
