package Beginner_1.maths;
/*Declare 3 variable v1, v2, v3 and initialize the values
as 10.5, 12.5 and 12.15 respectively. Then declare another variable
average that will store the average of these variables
and print the floored integer value.*/
public class Average {
    public static void main(String[] args) {
        float v1,v2,v3,avg;
        v1=10.5f;v2=12.5f;v3=12.15f;
        avg=(v1+v2+v3)/3;
        System.out.println(Math.floor(avg));
    }
}
