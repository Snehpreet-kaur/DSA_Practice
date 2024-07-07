package Beginner_1.Array_1D;
/*You are given an integer array Arr of size N and a number X.
You need to print all the indexes of the given X in the array,
else print -1.*/
import java.util.*;
public class Index_of_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int X=sc.nextInt();
        int Arr[]=new int[N];
        int c=0;
        for(int i=0;i<N;i++){
            Arr[i]=sc.nextInt();
            if(X== Arr[i]){
                c++;
                System.out.print((i+1)+ " ");
            }
        }
        if(c==0){
            System.out.println(-1);
        }
    }
}
