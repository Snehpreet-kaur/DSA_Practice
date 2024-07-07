package Beginner_1.maths;
/*You are required to take the radius of a circle as input from
the user, and finally, print the area and perimeter of the circle.
Note: Take pi as 3*/
import java.util.*;
public class circle_ar_pr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int peri,area,pi=3;
        peri=2*pi*r;
        area=pi*r*r;
        System.out.println("Perimeter = "+peri+"\n"+"area = "+area);
    }
}
