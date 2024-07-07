package Beginner_1.basic;
/*In this challenge, you must read 3 integers
 and then print them. Each integer must be printed on a new line.*/
import java.util.*;
public class scanner_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int o=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(n+"\n"+o+"\n"+k);
    }
}
