package Kattis.com;

import java.util.Scanner;

public class Ladder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Height=sc.nextInt();
        int Angle=sc.nextInt();

        int hypo=(int)(Math.ceil((Height)/(Math.sin((Angle*Math.PI)/180))));

        System.out.println(""+hypo);
    }
}
