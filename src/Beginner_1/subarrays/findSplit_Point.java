package Beginner_1.subarrays;
/*Write a program to Partition an array into two subarrays with the same sum.
Take input of size of array and the array elements then find if it is possible to
split the array in two subarrays (without reordering the elements), such that the sum
of the two subarrays is the same.
Input Format
Input consists of two lines.
First line contains an integer N denoting size of array
Second line contains N integers denoting the array elements separated by single space*/
import java.util.*;
public class findSplit_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0,sum1=0,fin=0,c=0;
       for(int i=0;i<N-1;i++){
           sum=sum+arr[i];
           sum1=0;
           for(int j=i+1;j<N;j++){
               sum1=sum1+arr[j];
           }
           if(sum == sum1){
               fin=i;c=1;
               break;
           }
       }
      if(c==1){
          for(int i=0;i<=fin;i++){
                  System.out.print(arr[i]+" ");
          }
          System.out.println();
          for(int j=fin+1;j<N;j++){
              System.out.print(arr[j]+" ");
          }
      }else{
          System.out.println("Not possible");
      }
    }
}