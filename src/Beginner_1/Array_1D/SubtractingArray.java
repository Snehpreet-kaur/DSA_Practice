package Beginner_1.Array_1D;
/*You have given a number n1, representing the size of array arr1.You have given a number n2, representing the size of
array arr2.The two arrays represent digits of two numbers.You are required to subtract the numbers represented by two
arrays and print the arrays. n1 and n2 can be of different sizes*/
import java.util.*;
public class SubtractingArray {
    public static int number(int arr[], int n) {
        int i=0,sum=0,c;
        while(n!=0){
            c=(int)Math.pow(10,n-1);
            sum=sum+c*arr[i];
            i++;
            n--;
        }
        return sum;
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
        int m=number(arr1,n1);
        int n=number(arr2,n2);
        System.out.println(m-n);

    }
}
