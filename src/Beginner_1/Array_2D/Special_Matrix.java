package Beginner_1.Array_2D;
/*A square matrix is called special matrix if all the non-diagonal elements of the matrix are zero and the
diagonal elements are non-zero.You are given a square matrix with N rows and columns. You have to check
 whether the given matrix is special or not. If the given matrix is special, true will be printed, else false.*/
import java.util.*;
public class Special_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int t=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    if(arr[i][j]==0){
                        t=2;
                        break;
                    }
                }else if(arr[i][j]!=0){
                    t=1;
                    break;
                }
            }
        }
        if(t==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
