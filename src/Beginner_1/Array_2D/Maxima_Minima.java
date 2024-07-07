package Beginner_1.Array_2D;
/*Given an n*n matrix mat find an element such that it is the smallest in a row and largest in a column, if such
 an element does not exist return -1.*/
import java.util.*;
public class Maxima_Minima {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0,min=0,counter=0;
        for(int i=0;i<n;i++){
            min=arr[i][i];
            for(int j=0;j<n;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        for(int m=0;m<n;m++){
            max=arr[m][m];
            for(int j=0;j<n;j++){
                if(arr[j][m]>max){
                    max=arr[j][m];
                }
            }
            if( min==max) {
                counter++;
                break;
            }
            }
        }
        if(counter==1){
            System.out.println(max);
        }else{
            System.out.println(-1);
        }
    }
}
