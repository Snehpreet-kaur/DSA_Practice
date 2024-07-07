package Beginner_2.String;
/*You are given a set 'S' of distinct characters. You are also given an array 'A' of 'N' strings.

A String in array 'A' is called good if all the characters of the string is present in the set 'S'.

You have to find how many strings in the array 'A' are good.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains a string denoting the characters of the set 'S'.

The next line contains 'N', the number of strings in 'A'.

The next 'N' lines contains a string each, which are the elements of the array 'A'.*/
import java.util.*;
public class Good_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String t;
        int l,l1,counter=0,count=0;
        l1=str.length();
        char ch,ch1;
        int N=sc.nextInt();
        String arr[]=new String[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println(str);
        System.out.println(N);
        for(int i=0;i<N;i++){
            System.out.println(arr[i] );
        }
        for(int j=0;j<N;j++){
            t=arr[j];
            l=t.length();
            for(int k=0;k<l1;k++){
                ch=str.charAt(k);
                for(int m=0;m<l;m++){
                    ch1=str.charAt(m);
                    if(ch==ch1){
                        counter++;
                    }else{
                        break;
                    }
                }
            }
            if(counter==l){
                count++;
            }
        }
        System.out.println(count);
    }
}
