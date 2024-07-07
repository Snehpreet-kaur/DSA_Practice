package Beginner_1.conditionals;
/*Given the number of the month, your task is to calculate the
number of days present in the particular month.
provided its a non leap year*/
import java.util.*;
public class no_of_days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nod=0;
        if(n==2){
            nod=28;
        }else if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12){
            nod=31;
        } else if (n==2 || n==4 || n==6 || n==9 || n==11) {
            nod=30;
        }
        System.out.println(nod);
    }
}
