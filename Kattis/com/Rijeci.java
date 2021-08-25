package Kattis.com;

import java.util.Scanner;

public class Rijeci {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int countA_Or=1;
        int countB_Or=0;
        int countA=1;
        int countB=0;

        int N=sc.nextInt();

        for(int i=0;i<N;i++){
            while(countA_Or>0){
               countB++;
               countA--;
               countA_Or--;
            }
            while(countB_Or>0){
                countA++;
                countB_Or--;
            }
            countA_Or=countA;
            countB_Or=countB;
        }
        System.out.println(""+countA_Or+" "+countB_Or);
    }
}
