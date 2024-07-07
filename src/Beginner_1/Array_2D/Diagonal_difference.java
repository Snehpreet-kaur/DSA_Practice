package Beginner_1.Array_2D;
/*Given a square matrix of size N, calculate the absolute difference between the sums of its diagonals.*/
import java.util.*;
public class Diagonal_difference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum1=0,sum2=0,diff;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum1=sum1+arr[i][j];
                }
                if(i+j == n-1){
                    sum2=sum2+arr[i][j];
                }
            }
        }
        diff=Math.abs(sum1-sum2);
        System.out.println(diff);
    }
}
