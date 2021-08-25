package Kattis.com;

import java.util.Scanner;

public class Batter_Up {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        float Result=0;
        int count=0;
        int Num[]=new int[N];

        for(int i=0;i<N;i++){
            Num[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            if(Num[i]>=0){
                count++;
                Result=Result+Num[i];
            }
        }
        Result=Result/count;
        System.out.println(""+Result);
    }
}
