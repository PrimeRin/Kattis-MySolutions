package Kattis.InProcess;

import java.util.Scanner;

public class Speeding {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr1[]=new int[N];
        int arr2[]=new int[N];

            for (int i = 0; i < N; i++) {
                arr1[i] = sc.nextInt();
                arr2[i] = sc.nextInt();
            }

        int Ddiff=arr2[N-1]-arr2[N-2];
        int Dtime=arr1[N-1]-arr1[N-2];

        int speed=Ddiff/Dtime;
        System.out.println(speed);
    }
}
