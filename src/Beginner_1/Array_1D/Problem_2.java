package Beginner_1.Array_1D;
/*Write a program to count the elements in an array which are greater than 35.
Input Format:First line contains n, the size of an array.
Next line contains n-spaced integers representing array arr.*/
import java.util.*;
public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(arr[j]>35){
                c++;
            }
        }
        System.out.println(c);
    }
}
