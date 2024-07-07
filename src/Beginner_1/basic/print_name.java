package Beginner_1.basic;
/*You are required to take input a string agentName,
and finally print the line "Hi my name is Agent insert agentName".*/
import java.util.*;
public class print_name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String agentName=sc.nextLine();
        System.out.println("Hi my name is Agent "+agentName);
    }
}
