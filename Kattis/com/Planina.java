package Kattis.com;

import java.util.Scanner;

public class Planina {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int side=2;

        for(int i=1;i<=N;i++){
            side=side+(side-1);
        }
        System.out.println(""+(side*side));
    }
}
