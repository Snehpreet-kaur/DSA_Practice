package Beginner_1.Array_1D;
/*Ruma has given an array arr to Sima such that it consists of n elements.
Ruma asks Sima to write a program to find out the index of the largest
element in present in the array and print the index.
Your task is to help Sima by writing a program.
NOTE: Output should be in zero based indexing. If there are multiple
occurences of the largest number, return the smallest index.*/
import java.util.*;
public class problem_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0,index=0;
        for(int j=0;j<n;j++){
            if(arr[j]>max){
                max=arr[j];
                index=j;
            }
        }
        System.out.println(index);
    }
}
