package Beginner_1.Array_1D;
/*Given an unsorted integer array of size n. Find the last occurrence of
a given key.The key is always present in the array.
Input Format
First line contains two spaced integers representing the array size n
and key.Next line contains n-spaced integers representing array a.*/
import java.util.*;
public class last_occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int key=sc.nextInt();
        int arr[]=new int[size];
        int ans=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==key){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
