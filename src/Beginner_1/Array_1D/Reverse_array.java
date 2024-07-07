package Beginner_1.Array_1D;
/*ou are given an array arr of length n. You have to come up with an in-place solution.

Input Format
The first line of input contains an integer n, size of the array.

The next line contains n space-separated integers denoting the elements of the array.*/
import java.util.*;
public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        int j=n-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arr1[j]=arr[i];
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr1[k]+" ");
        }
    }
}
