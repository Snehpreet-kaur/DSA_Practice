package Beginner_1.conditionals;
/*Take two positive integers from the user.
Verify if (a+b)^3 = a^3 + b^3 + 3a^2b + 3ab^2.
Calculate the Left hand side (LHS) and the right hand side (RHS)
of the equation. Print the (LHS) and the (RHS).Print VERIFIED
in uppercase if they are equal, otherwise print NOT VERIFIED.*/
import java.util.*;
public class conditional_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b =sc.nextInt();
        int LHS,RHS;
        LHS=(int)Math.pow((a+b),3);
        RHS=((int)Math.pow(a,3))+((int)Math.pow(b,3))+(3*a*a*b)+(3*b*b*a);
        System.out.println("LHS= "+LHS);
        System.out.println("RHS= "+RHS);
        if(LHS==RHS){
            System.out.println("VERIFIED");
        }else{
            System.out.println("NOT VERIFIED");
        }
    }
}
