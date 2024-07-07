package Beginner_1.Array_1D;
/*Given an array with N elements, the task is to rotate the array to the right by K steps.
Note : if K is negative , rotate the array to the left.*/
import java.util.*;
public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int arr[]=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int j=0;
        int arr1[]=new int[N];
        if(k>0) {
            for (int i = N - k; i < N; i++) {
                arr1[j] = arr[i];
                j++;
            }
            for (int i = 0; i < N - k; i++) {
                arr1[j] = arr[i];
                j++;
            }
        }else if(k<0){
            k=Math.abs(k);
            for(int i=k;i<N;i++){
                arr1[j]=arr[i];
                j++;
            }
            for(int i=0;i<k;i++){
                arr1[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(arr1[i]+ " ");
        }
    }
}
