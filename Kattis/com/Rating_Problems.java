package Kattis.com;

import java.util.Scanner;

public class Rating_Problems {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Rating_Problems ob=new Rating_Problems();
        int N=sc.nextInt();
        int K=sc.nextInt();

        float arr[]=new float[K];
        float sum=0;

        for(int i=0;i<K;i++){
            arr[i]=sc.nextFloat();
            sum=sum+arr[i];
        }
        ob.minimumV(sum,N-K,N);
        ob.maximumV(sum,N-K,N);

    }

    public void maximumV(float s,int n,int N){
        float avg;
        avg=s +(n*3);
        avg=avg/N;
        System.out.println(avg);

    }

    public void minimumV(float s,int n,int N){
        float avg;
        avg=s +(n*-3);
        avg=avg/N;
        System.out.println(avg+" ");
    }

}
