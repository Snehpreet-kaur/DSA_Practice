package Beginner_1.Array_1D;
/*Given an array of N integers, count the total pairs of integers
that have a difference of K.*/
import java.util.*;
public class pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int arr[]=new int[N];
        int diff,c=0;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N-1;i++){
            for(int j=i;j<N;j++){
                diff=Math.abs(arr[i]-arr[j]);
                if(diff == K) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
