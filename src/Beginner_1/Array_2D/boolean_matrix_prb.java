package Beginner_1.Array_2D;
/*You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be
either 0 or 1.Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing
the mentioned operation, you need to return the modified matrix.*/
import java.util.*;
public class boolean_matrix_prb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();}}
        int sum=0;
        for(int i=0;i<m;i++){
            sum=0;
            for(int j=0;j<n;j++){
                sum=sum+arr[i][j];
            }
            if(sum ==0){
                for(int k=0;k<m;k++){
                    System.out.print(0+" ");
                }}else{
                for(int k=0;k<m;k++){
                    System.out.print(1+" ");}
            }
            System.out.println();
        }
    }
}
