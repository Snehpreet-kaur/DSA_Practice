package Beginner_1.conditionals;
/*Four friends are in a mystery room and they aim to get out of
the mystery room by cracking the final trail. The mystery room
is divided into four chambers and each chamber will have two
boxes storing balls. Now if both the boxes have blue balls,
it must belong to chamber 1. Similarly if the first box has red
balls and second box has blue balls, they must belong to chamber
2. If both the boxes have red balls, they must belong to chamber
3. Finally if the first box has blue balls and second box has
red balls, it must belong to chamber 4.You are given number of
balls in each box and if the number has a negative sign it means
the balls are red else the balls are blue if the sign is positive.
Determine the chamber the two boxes belong to given the number and
type of balls in each box.*/
import java.util.*;
public class mystery_Room_balls{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int chamber=0;
        if(b1>=0 && b2>0){
            chamber=1;
        }else if(b1<0 && b2>=0){
            chamber=2;
        }else if(b1<0 && b2<0){
            chamber=3;
        }else if(b1>=0 && b2<0){
            chamber=4;
        }
        System.out.println("The boxes belong to chamber "+chamber);
    }
}
