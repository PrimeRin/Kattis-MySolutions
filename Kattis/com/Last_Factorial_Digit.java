package Kattis.com;

import java.util.Scanner;

public class Last_Factorial_Digit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Num[]=new int[N];

        for(int i=0;i<N;i++){
            Num[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            int fact=Factorial(Num[i]);
            System.out.println(""+fact);
        }
    }

    private static int Factorial(int a){
        int fact=1;
        while(a>=1){
            fact=fact*a;
            a--;
        }
        return (fact%10);
    }
}
