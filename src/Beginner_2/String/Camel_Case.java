package Beginner_2.String;
/*You are given a string consisting of different words separated by underscores _. You have to convert the string
to camel case. The first letter of the entire case should be lowercase.eg: app_dsd_sdda to appDsdSdda*/
import java.util.*;
public class Camel_Case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        char ch,ch1;
        String str1="";
        str=str.toLowerCase();
        for(int i=0;i<l;i++){
            ch=str.charAt(i);
            if(ch!='_'){
                str1+=ch;
            }else{
                ch1=str.charAt(i+1);
                str1+=Character.toUpperCase(ch1);
                i+=1;
            }
        }
        System.out.println(str1);
    }
}
