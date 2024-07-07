package Beginner_1.functions;
/*Given a positive integer N. The task is to Create a function and
return true or false according to the condition that whether zero is
present at the second last place value or not.You have to print the
 output in the calling function itself based on the boolean value
 you get in return from the function.The output should be Yes or No.*/
import java.util.*;
public class placeValue_checker {
    public static boolean checker(int N) {
        boolean b;
        int d=N%100;
        int d1=d/10;
        if(d1==0){
            b=true;
        }else{
            b=false;
        }
        return (b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        boolean b=checker(N);
        if(b==true){
            System.out.println("Yes");
        }else if(b==false){
            System.out.println("No");
        }
    }
}
