package Beginner_1.Array_2D;
/*You are given 2D Array arr of size N x M, print the elements of it.*/
import java.util.*;
public class print2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int arr[][]=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
