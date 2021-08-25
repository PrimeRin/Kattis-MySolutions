package Kattis.com;

import java.util.Scanner;

public class Laptop_Sticker {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l1=sc.nextInt();
        int w1=sc.nextInt();

        int ls2=sc.nextInt();
        int ws2=sc.nextInt();

        int l=l1-ls2;
        int w=w1-ws2;


        if(l>=1 && w>=1 && l==w){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }

}
