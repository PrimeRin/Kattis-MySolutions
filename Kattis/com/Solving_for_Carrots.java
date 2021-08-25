package Kattis.com;

import java.util.Scanner;

public class Solving_for_Carrots {
    public static void main(String [] args) {
       Scanner sc=new Scanner(System.in);

       int N=sc.nextInt();
       int P=sc.nextInt();

       String arr[]=new String[N];

       for(int i=0;i<N;i++){
           arr[i]=sc.nextLine();
       }

       System.out.println("\n"+P);
    }
}
