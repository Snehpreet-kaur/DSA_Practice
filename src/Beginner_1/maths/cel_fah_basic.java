package Beginner_1.maths;
/*Given the temperature of a city in Celsius (C) represented by the
variable tempInCelsius, your task is to convert the temperature to
Fahrenheit (F) and print it.provided the temp is a multiple of 5 */
import java.util.*;
public class cel_fah_basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cel=sc.nextInt();
        int fah= ((cel*9)/5)+32;
        System.out.println("Temperature in Fahrenheit is: "+fah);
    }
}
