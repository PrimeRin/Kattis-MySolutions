package Kattis.com;

import java.util.Scanner;

public class Soda_Slurper {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int f=sc.nextInt();
        int c=sc.nextInt();
        int bottleCount=e+f;
        int count=0;
        while(bottleCount>=c){
            bottleCount=bottleCount-c;
            bottleCount++;
            count++;
        }
        System.out.println(count);
    }
}
