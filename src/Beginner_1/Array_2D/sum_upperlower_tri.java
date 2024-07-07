package Beginner_1.Array_2D;
/*Given a square matrix of size n*n, print the sum of upper and lower triangular elements.
Upper Triangle consists of elements on the diagonal and above it.
Lower triangle consists of elements on the diagonal and below it.*/
import java.util.*;
public class sum_upperlower_tri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //lower triangle
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                sum1=sum1+arr[i][j];
            }
        }
        //upper triangle
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum2=sum2+arr[i][j];
            }
        }
        System.out.println(sum2+" "+sum1);
    }
}
