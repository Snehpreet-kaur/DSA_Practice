package Beginner_2.String;
/*Given a string str, determine if it is a palindrome, considering only alphabetic characters and ignoring the upper or lower case. Return 0 if it is not a palindrome, else return 1.

Input Format
Input consists of one line

The first line given is a string str.*/
import java.util.*;
public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        int l;
        String str1="";
        char ch;
        str=str.toLowerCase();
        l=str.length();
        for(int i=0;i<l;i++){
            ch=str.charAt(i);
            str1=ch+str1;
        }
        if(str.equalsIgnoreCase(str1)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
