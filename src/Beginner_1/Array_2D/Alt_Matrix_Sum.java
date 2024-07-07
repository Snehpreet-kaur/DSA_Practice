package Beginner_1.Array_2D;
/*You are given a chessboard of size N x N, where the top left square is black. Each square contains a value.
Find the sum of the values of all black squares and all white squares.*/
import java.util.*;
public class Alt_Matrix_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0,sum1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                sum = sum + arr[i][j];
                if (i == j) {
                    if (i < n / 2) {
                        for (int k = i; k < n; k += 2) {
                            sum1 = sum1 + arr[i][k];
                        }
                    } else {
                        for (int k = i; k >= 0; k -= 2) {
                            sum1 = sum1 + arr[i][k];
                        }
                    }
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum-sum1);
    }
}
