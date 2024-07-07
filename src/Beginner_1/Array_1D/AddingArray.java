package Beginner_1.Array_1D;
/*You have given a number n1, representing the size of array arr1.You have given n2 numbers, representing elements of
array arr2. The two arrays represent the digits of two numbers.You are required to add the numbers represented by
two arrays and return the resultant arrays. n1 and n2 are of diferent size*/
import java.util.*;
public class AddingArray {
    public static int value(int arr[], int n) {
        int number=0,c,i=0;
        while(n!=0){
            c=(int)Math.pow(10,n-1);
            number=number+c*arr[i];
            i++;n--;
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for(int j=0;j<n2;j++){
            arr2[j]=sc.nextInt();
        }
        int no_1=value(arr1,n1);
        int no_2=value(arr2,n2);
        System.out.println(no_1+no_2);
    }
}
