package Beginner_1.conditionals;
/*You are provided with a number n.Your task is to return a
string according to the following conditions:
If the number is greater than 1, then return You entered more
If the number is less than or equal to 1 then return
You entered less*/
import java.util.*;
public class conditional_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>1){
            System.out.println("You entered more");
        }else if(n<=1){
            System.out.println("You entered less");
        }
    }
}
