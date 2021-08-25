package Kattis.com;

import java.util.Scanner;

public class Magic_Trick {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char arr[]=new char[str.length()];

        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }

        boolean p=true;

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if (arr[i] == arr[j]) {
                    p=false;
                }
            }
        }

        if(p){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }

}
