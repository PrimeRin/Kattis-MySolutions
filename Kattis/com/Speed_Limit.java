package Kattis.com;

import java.util.Scanner;

public class Speed_Limit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do{
            int arr[][] = new int[n][2];
            for(int i=0;i<n;i++){
                for(int j=0;j<2;j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            int totalDistance=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<1;j++) {
                    if(i==0) {
                        totalDistance = totalDistance + (arr[i][j] * arr[i][j + 1]);
                    }
                    else{
                        totalDistance = totalDistance + (arr[i][j] * (arr[i][j+1]-arr[i-1][j+1]));
                    }
                }
            }
            System.out.println(" "+totalDistance+" miles");
            n=sc.nextInt();
        } while(n!=-1);
    }
}
