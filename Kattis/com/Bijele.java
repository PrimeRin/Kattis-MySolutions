package Kattis.com;

import java.util.Scanner;

public class Bijele {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        int result[]=new int[6];

        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++){
            switch(i){
                case 0:result[i]=1-arr[0];
                break;
                case 1:result[i]=1-arr[1];
                    break;
                case 2:result[i]=2-arr[2];
                    break;
                case 3:result[i]=2-arr[3];
                    break;
                case 4:result[i]=2-arr[4];
                    break;
                case 5:result[i]=8-arr[5];
                    break;
            }
        }
        for(int i: result){
            System.out.print(i+" ");
        }
    }
}
