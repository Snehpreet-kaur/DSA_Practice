package Beginner_1.nested_loops;
/*Given an integer n, print a right angled triangle full of stars with height and base equal to n.*/
import java.util.*;
public class RightAngledTriangle_Stars {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
