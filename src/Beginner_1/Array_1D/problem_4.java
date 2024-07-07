package Beginner_1.Array_1D;
/*Write a program to find out the difference between sum of all
the elements in two arrays arr1 and arr2.If sum of all elements in
arr1 is larger then, the output should be First array is larger,
if sum of all elements in arr2 is larger then, the output should
be Second array is larger,otherwise the output should be Both are equal.*/
import java.util.*;
public class problem_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,sum1=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int m=sc.nextInt();
        int arr1[]=new int[m];
        for(int j=0;j<m;j++){
            arr1[j]=sc.nextInt();
            sum1=sum1+arr1[j];
        }
        if(sum>sum1){
            System.out.println("First array is larger");
        }else if(sum<sum1){
            System.out.println("Second array is larger");
        }else if(sum==sum1){
            System.out.println("Both are equal");
        }
    }
}
