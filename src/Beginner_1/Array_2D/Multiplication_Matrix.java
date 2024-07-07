package Beginner_1.Array_2D;
/*Given two square Matrices A and B each of N rows and N columns, you need to multiply the two matrices.
Return the product matrix.*/
import java.util.*;
public class Multiplication_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr1[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr1[i][j]=sc.nextInt();}}
        int arr2[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr2[i][j]=sc.nextInt();}}
        //multiplication of matrix
        int mul=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int m=0;m<N;m++){
                    mul=mul+arr1[m][i]*arr2[i][m];
                }
                System.out.print(mul+" ");
                mul=0;
            }
            System.out.println();
        }

    }
}
