package Beginner_1.nested_loops;
/*Given an integer n, print a pyramid full of stars with height equal to n.
eg n=3
   *
  * *
 * * * */
import java.util.*;
public class Star_Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=i;k<=n;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
