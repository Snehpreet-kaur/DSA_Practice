package Beginner_1.functions;
/*You have given a string name of user. The user gives his name as to
you and your task is to return string "name" is a Super Hero.
You have to complete ModifyName function which consists of single
string name as input and return the string as mentioned above as output*/
import java.util.*;
public class superHero {
    public static String ModifyName(String str) {
        String sent=str+" is a Super Hero.";
                return(sent);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String sent=ModifyName(str);
        System.out.println(sent);
    }
}
