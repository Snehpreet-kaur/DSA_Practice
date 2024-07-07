package Beginner_1.subarrays;
/*Given an array arr[] of size N. The user will take the elements of the array as input. Count the total number
of subarrays of size 4 where all the elements are strictly increasing in order. Print 0 if there exist no such subarrays.*/
import java.util.*;
public class problem_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0,c=0;
        for(int i=0;i<N-3;i++) {
            c=0;
            for (int k = i; k < i + 3; k++) {
                if (arr[k] < arr[k + 1]) {
                    c++;
                }
                if (c == 3) {
                    ++count;
                    c=0;
                }
            }
        }
        System.out.println(count);
    }
}
