package Kattis.com;

import java.util.Scanner;

public class Greetings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str;
        char ch='e';
        int count=0;
        str=sc.nextLine();
        char arr[]=new char[str.length()];

        char arr1[]=new char[str.length()*2];
        int n=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==ch){
               arr1[n]=ch;
               n++;
               arr1[n]=ch;
               n++;
            }
            else {
                arr1[n] = str.charAt(i);
                n++;
            }
        }
        String output=new String(arr1);
        System.out.println(""+output);
    }
}
