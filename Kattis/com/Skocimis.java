package Kattis.com;

import java.util.Scanner;

public class Skocimis {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Skocimis ob=new Skocimis();
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int count1=ob.method1(A,B,C);
        int count2=ob.method2(A,B,C);

        if(count1>count2){
            System.out.println(count1);
        }
        else{
            System.out.println(count2);
        }
    }
    public int method1(int A,int B,int C){
        int count1=0;
        while(B!=(A+1)){
            C=B-1;
            count1++;
            int temp=B;
            B=C;
            C=temp;
        }
       return count1;
    }
    public int method2(int A,int B,int C){
        int count2=0;
        while(B!=(C-1)){
            A=B+1;
            count2++;
            int temp=B;
            B=A;
            A=temp;
        }
        return count2;
    }
}
