package Kattis.com;

import java.util.Scanner;

public class IsItHalloween_com {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String Month=sc.next().toUpperCase();
        int date=sc.nextInt();

        if(Month.equals("OCT") && date==31 || Month.equals("DEC") && date==25){
            System.out.println("yup");
        }
        else{
            System.out.println("nope");
        }
    }
}
