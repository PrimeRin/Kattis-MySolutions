package Kattis.com;

import java.util.Scanner;

public class Trik {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char [] position={'A','B','C'};

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'){
                char temp=position[0];
                position[0]=position[1];
                position[1]=temp;
            }
            else if(str.charAt(i)=='B'){
                char temp=position[2];
                position[2]=position[1];
                position[1]=temp;
            }
            else if(str.charAt(i)=='C'){
                char temp=position[2];
                position[2]=position[0];
                position[0]=temp;
            }
        }
        for(int i=0;i<3;i++){
            if(position[i]=='A'){
              System.out.println(""+(i+1));
            }
        }
    }
}
