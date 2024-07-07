package Beginner_1.Array_2D;
/*You are given a n x n 2-D matrix representing an image, rotate the image by 90 degrees (clockwise).
Input Format
The first line will contain two integers n and n again.
The next n lines contain n integers each representing the matrix.*/
import java.util.*;
public class Rotate_by90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[j][k]+" ");
            }
            k++;
            System.out.println();
        }
    }
}
