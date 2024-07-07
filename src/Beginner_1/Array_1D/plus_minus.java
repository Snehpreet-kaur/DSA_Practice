package Beginner_1.Array_1D;
/*Given an array arr of N integers, Calculate the ratios of its elements
 that are positive, negative, and zero to the array size N.
Print the decimal value of each fraction in a new line up to
6 decimal places.
Input Format
The first line contains an integer N, the size of the array.
The second line contains N space-separated integers representing
the array arr.*/
import java.util.*;
public class plus_minus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        double pos=0,neg=0,zer=0;
        for(int i=0;i<N;i++){
            if(arr[i]>0){
                pos++;
            }else if(arr[i]<0){
                neg++;
            }else if(arr[i] == 0){
                zer++;
            }
        }
        System.out.printf("%.6f",(pos/N));
        System.out.println();
        System.out.printf("%.6f",(neg/N));
        System.out.println();
        System.out.printf("%.6f",(zer/N));
    }
}
