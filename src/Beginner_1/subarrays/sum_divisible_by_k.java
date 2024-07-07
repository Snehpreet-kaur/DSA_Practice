package Beginner_1.subarrays;
/*Given an integer array nums and an integer k, print the number of non-empty subarrays that have a sum divisible by k.
A subarray is a contiguous part of an array.*/
import java.util.*;
public class sum_divisible_by_k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        int sum=0,count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=0;
                for(int l = i; l <=j; l++) {
                    sum = sum + nums[l];
                }
                    if(sum%k==0){
                        count++;
                    }
            }
        }
        System.out.println(count);
    }
}
