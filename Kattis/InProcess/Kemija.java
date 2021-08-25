package Kattis.InProcess;

import java.util.*;

public class Kemija {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char [] ch=new char[str.length()];
        int count=0;
        for(int i=0;i<str.length();i++){
            ch[i]=str.charAt(i);
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                count++;
            }
        }

        int size=ch.length + count +count;
        char [] ch2=new char[size];
        int j=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                ch2[j]=ch[i];
                j++;
                ch2[j]='p';
                j++;
                ch2[j]=ch[i];
                j++;
            }
            else{
                ch2[j]=ch[i];
                j++;
            }
        }

        String str1=new String(ch2);
        System.out.println(""+str1);

    }
}
