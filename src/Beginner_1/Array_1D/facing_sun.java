package Beginner_1.Array_1D;
/*Given an array h representing heights of buildings. You have to count the buildings
which will see the sunrise (Assume : Sun rise on the side of array starting point).
Input Format
line 1: contains an integer n denoting size of array.
line 2: contains n spaced integers denoting elements of array.*/
import java.util.*;
public class facing_sun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],c=1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>max){
                    c++;
                    max=arr[j];
                }
            }
        }
        System.out.println(c);
    }
}
