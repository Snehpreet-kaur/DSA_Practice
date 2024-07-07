package Beginner_1.Array_1D;
/*Write a program to find out the maximum difference between any
two element in an array.Note: if an element is arr[i] and another element
is arr[j] then difference will be |arr[i]-arr[j]| .*/
import java.util.*;
public class Max_diff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0],diff;
        for(int j=0;j<n;j++){
            if(arr[j]>max){
                max=arr[j];
            }else if(arr[j]<min){
                min=arr[j];
            }
        }
        diff=max-min;
        System.out.println(diff);
    }
}
