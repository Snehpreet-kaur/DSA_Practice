package Beginner_1.Array_1D;
/*Karan has an array arr and an integer k. He wants to find out the
number of consecutive pairs of array elements whose sum will be k.
Write a program to count the number of consecutive pairs.
Note that, if arr[5]={1,2,3,4,5} then consecutive pairs are (1,2),
(2,3),(3,4),(4,5).
Input Format
The first line contains n, the size of the array, and a positive integer k.
The second line contains n elements of the array.*/
import java.util.*;
public class problem_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n-1;j++){
            if(arr[j]+arr[j+1] == k){
                c++;
            }
        }
        System.out.println(c);
    }
}
