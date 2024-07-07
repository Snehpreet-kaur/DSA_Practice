package Beginner_1.Array_1D;
/*Given an array arr of size n, Write a program to find the below 3 values.
Sum of all the elements in the array.
Average of all the elements in the array (Give the floor value).
Maximum element in the array.*/
import java.util.*;
public class arr_operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0,avg,max=arr[0];
        for(int j=0;j<n;j++){
            sum=sum+arr[j];
            if(arr[j]>max){
                max=arr[j];
            }
        }
        avg=(int)(Math.floor(sum/n));
        System.out.println("Sum = "+sum +"\n"+"Average is: "+avg+"\n"+"Maximum value is "+max);
    }
}
