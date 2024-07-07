package Beginner_1.Array_2D;
/*Given a 2-D matrix A with N rows and M columns. Print the matrix in column-major order.

Your task is to complete the function printMatrixColumnwise which receives the input matrix, N, and M as its parameters and prints the matrix in column major order.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains two integers N and M denoting the number of rows and columns respectively.

The next N lines contains M integers each denoting the elements of matrix A.*/
import java.util.*;
public class column_wise {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[j][i]+" ");
            }
        }
    }
}
