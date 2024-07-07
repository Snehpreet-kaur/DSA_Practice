package Beginner_1.Loops;
/*You have to keep taking integers as input until you get an odd number as input. Your output will be N, which
represents the number of numbers you had to take as input up till encountering an odd number.*/
import java.util.*;
public class odd_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int c=0;
        boolean f=true;
        int m;
        while( f!=false){
            m=sc.nextInt();
            c++;
            if(m%2==0){
                f=false;
            }
        }
        System.out.println(c-1);
    }

}
