package Beginner_1.conditionals;
/*Given a year, find if it is a leap year.A Leap year is a year that is multiple of 4. However, multiples of 100 except
for the multiples of 400 are not leap years.Your task is to print 1 or 0 depending upon if the year is a leap year or
not.*/
import java.util.*;
public class conditional_2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int ans=0;
        if(year%4==0){
            ans=1;
            if(year%400!=0 && year%100==0){
                ans=0;
            }
        }else{
            ans=0;
        }
        System.out.println(ans);
    }
}
