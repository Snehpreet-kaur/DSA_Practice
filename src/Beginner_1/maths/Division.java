package Beginner_1.maths;

/*Declare two variables as a and b.
Declare another two variables quo and rem
that will store the quotient and remainder of these numbers
taking a as dividend and b as divisor.
Initialize the values to those variables as 1042 and 7 respectively.*/

public class Division {
    public static void main(String[] args) {
        int a=1042,b=7;
        int quo,rem;
        quo=a/b;
        rem=a%b;
        System.out.println("Quotient:" +quo +"\n"+ "Remainder: "+rem);
    }
}
