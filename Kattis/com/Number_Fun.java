package Kattis.com;

import java.util.Scanner;

public class Number_Fun {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[][]=new int[N][3];

        for(int i=0;i<N;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){

               if((arr[i][0]+arr[i][1])==arr[i][2]){
                   System.out.println("Possible");
               }
               else if((arr[i][0]-arr[i][1])==arr[i][2] || (arr[i][1]-arr[i][0])==arr[i][2] ){
                   System.out.println("Possible");
               }
               else if((arr[i][0]*arr[i][1])==arr[i][2]){
                   System.out.println("Possible");
               }
               else if((arr[i][0]*arr[i][2])==arr[i][1] || (arr[i][1]*arr[i][2])==arr[i][0]){
                   System.out.println("Possible");
               }
               else{
                   System.out.println("Impossible");
               }
        }
    }
}
