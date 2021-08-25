package Kattis.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Autori {
    public static void main(String arg[]) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        char ch[]=str.toCharArray();

        for(int i=0;i<ch.length;i++){
           if(Character.isUpperCase(ch[i])){
               System.out.print(""+ch[i]);
           }
        }
    }
}
