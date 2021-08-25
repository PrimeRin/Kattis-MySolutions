package Kattis.com;

import java.util.Scanner;

public class One_Chicken_Per_Person {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        int count=M-N;

        if(count>1){
         System.out.println("Dr. Chaz will have "+count+" pieces of chicken left over!");
        }
        else if(count==1){
            System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
        }
        else if(count==-1){
            System.out.println("Dr. Chaz needs 1 more piece of chicken!");
        }

        else if(count<0){
            count=count*-1;
           System.out.println("Dr. Chaz needs "+count+" more pieces of chicken!");
        }
    }
}
