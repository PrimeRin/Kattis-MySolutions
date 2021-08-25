package Kattis.com;

import java.util.Scanner;

public class Cetvrta {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int []p0=new int[2];
        int []p1=new int[2];
        int []p2=new int[2];

        int x=0;
        int y=0;

        for(int i=0;i<2;i++){
            p0[i]=sc.nextInt();
        }
        for(int i=0;i<2;i++){
            p1[i]=sc.nextInt();
        }
        for(int i=0;i<2;i++){
            p2[i]=sc.nextInt();
        }

        for(int i=0;i<2;i++){
            if(i==0){
            if(p0[i]==p1[i]){
                x=p2[i];
            }
            else if(p0[i]==p2[i]){
                x=p1[i];
            }
            else if(p1[i]==p2[i]){
                x=p0[i];
            }
        }
            else{
                if(p0[i]==p1[i]){
                    y=p2[i];
                }
                else if(p0[i]==p2[i]){
                    y=p1[i];
                }
                else if(p1[i]==p2[i]){
                    y=p0[i];
                }
            }
            }
        System.out.println(""+x+" "+y);
    }
}
