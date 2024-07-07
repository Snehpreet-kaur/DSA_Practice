package Beginner_1.Array_2D;
/*Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing
 rows to columns and columns to rows.*/
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
