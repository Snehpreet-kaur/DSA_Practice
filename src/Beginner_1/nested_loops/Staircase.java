package Beginner_1.nested_loops;
/*In this question, you need to write a program that prints a staircase of size N.
This is a staircase of size n=4:
   #
  ##
 ###
####
Its base and height are both equal to n. It is drawn using # symbols and spaces.
The last line is not preceded by any spaces.*/
import java.util.*;
public class Staircase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
