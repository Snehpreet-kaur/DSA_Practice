package Beginner_1.unsolved;
/*Given an m*n matrix, print the boundary traversal of the matrix in clockwise order.*/
import java.util.*;
public class Boundary_transversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
}