package Beginner_1.Loops;
/*Given an unsorted array of size N find the 2nd largest element from the array without sorting the array.*/
import java.util.*;
public class largest_2nd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        int secmax=0;
        for(int i=0;i<N;i++){
            if(arr[i]<=max){
                secmax=max;
                max=arr[i];
            }
            else if(secmax<arr[i]){
                secmax=arr[i];
            }
        }
        System.out.println(secmax);
    }
}
