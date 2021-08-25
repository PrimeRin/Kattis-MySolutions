package Kattis.InProcess;

import java.util.Scanner;

public class Almost_Perfect {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int N=3;
        int arr[]=new int[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }



        for(int j=0;j<N;j++) {
            int count=0;
            for (int i = 1; i < N; i++) {
                if (arr[j] % i == 0) {
                    count = count + i;
                }
            }
            checkResult(arr[j],count);
        }


    }

    private static void checkResult(int N,int count) {
        int diff=count-N;
        if(diff<0){
            diff=diff*(-1);
        }
        if(count==N){
            System.out.println(N+" perfect");
        }
        else if(diff<=2){
            System.out.println(N+" almost perfect");
        }
        else{
            System.out.println(N+" not perfect ");
        }
    }
}
