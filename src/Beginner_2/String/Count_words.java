package Beginner_2.String;
/*You are given a string containing some space-separated words. You need to count the number of words in the string.

NOTE

You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format
The first line contains the number of test cases.

For each test case: The first line has the string S.*/
import java.util.*;
public class Count_words {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        String str1="";
        int l,word=0;
        char ch;
        str=str.strip();
        str=str+" ";
        l=str.length();
        for(int i=0;i<l;i++){
            ch=str.charAt(i);
            if(ch!=' '){
                str1=str1+ch;
            }else{
                word++;
            }
        }
        System.out.println(word);
    }
}
