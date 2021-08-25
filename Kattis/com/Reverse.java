package Kattis.com;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] Num=new int[N];
        int [] Rev=new int[N];

        for(int i=0;i<N;i++){
           Num[i]=sc.nextInt();
           Rev[(N-1)-i]=Num[i];
        }
        for(int i:Rev){
            System.out.println(""+i);
        }
    }
}
