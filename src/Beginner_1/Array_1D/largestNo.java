package Beginner_1.Array_1D;
/*You are given an integer array nums of size n where the largest integer is unique. Your task is to determine
whether the largest element in the array is at least twice as much as every other number in the array. If it is,
print the index of the largest element, or print -1 otherwise.
Input Format
The first line of the input contains the number n(length of the array),
The next line contains n space separated integers denoting the elements of the array.*/
import java.util.*;
public class largestNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
       int max=num[0],pos=0,c=0;
        for(int i=0;i<n;i++){
            if(num[i]>max){
                max=num[i];
                pos=i;
            }
        }
        for(int i=0;i<n;i++){
            if(max!=num[i] && (num[i]*2) <=max) {
                c++;
            }
        }
        if(c!=n-1){
            pos=-1;
        }
        System.out.println(pos);
    }
}
