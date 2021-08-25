package Kattis.com;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []arr=new int[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        if(N%2!=0){
            System.out.println("still running");
        }else{
            int sum=0;
            for(int i=0;i<(N-1);i++){
                sum=sum+(arr[i+1]-arr[i]);
                i++;
            }
            System.out.println(sum);
        }
    }
}
