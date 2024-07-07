package Beginner_1.conditionals;
/*Gian and Suneo want their heights to be equal so they asked Doraemon for help. Doraemon gave a big light to both of
them but both big lights have different speeds of magnifying. Let us assume the big light given to Gian can increase
the height of a person by v1 m/s and that of Suneos big light is v2 m/s. At the end of each second Doraemon check if
their heights are equal or not.Given the initial height of Gian and Suneo, your task is to check whether the height of
Gian and Suneo will become equal at some point or not, assuming they both started at the same time.*/
import java.util.*;
public class conditional_2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hg=sc.nextInt();
        int hs=sc.nextInt();
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        int c=0,l;
        int mul=hg*v1;
        int mul2=hs*v2;
        if(mul>mul2){
            l=mul;
        }else{
            l=mul2;
        }
        for(int i=0;i<l;i++){
            hg=hg+v1;
            hs=hs+v2;
            if(hg==hs){
                c=1;
                break;
            }
        }
        if(c==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
