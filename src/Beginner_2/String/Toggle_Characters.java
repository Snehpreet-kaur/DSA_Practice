package Beginner_2.String;
/*Given a string of length N, toggle the case of all the characters in the string, i.e.
You should set all lowercase characters to uppercase and vice versa.*/
import java.util.*;
public class Toggle_Characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int N;
        char ch;
        N=str.length();
        String str1="";
        for(int i=0;i<N;i++){
            ch=str.charAt(i);
            int m=(int)ch;
            if(m>=97 && m<=122){
                str1+=(char)(m-32);
            }else if(m>=65&&m<=90){
                str1+=(char)(m+32);
            }else{
                str1+=ch;
            }
        }
        System.out.println(str1);
    }
}
