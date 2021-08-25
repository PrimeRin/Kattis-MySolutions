package Kattis.com;

import java.util.Scanner;

public class Pet {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Pet ob=new Pet();
        int []p0=new int[4];
        int []p1=new int[4];
        int []p2=new int[4];
        int []p3=new int[4];
        int []p4=new int[4];
        int sum[]={0,0,0,0,0};


        for(int i=0;i<5;i++) {
            switch (i) {
                case 0:
                    for (int j = 0; j < 4; j++) {
                        p0[j] = sc.nextInt();
                        sum[i] = sum[i] + p0[j];
                    }
                    break;
                case 1:
                    for (int j = 0; j < 4; j++) {
                        p1[j] = sc.nextInt();
                        sum[i] = sum[i] + p1[j];
                    }
                    break;
                case 2:
                    for (int j = 0; j < 4; j++) {
                        p2[j] = sc.nextInt();
                        sum[i] = sum[i] + p2[j];
                    }
                    break;
                case 3:
                    for (int j = 0; j < 4; j++) {
                        p3[j] = sc.nextInt();
                        sum[i] = sum[i] + p3[j];
                    }
                    break;
                case 4:
                    for (int j = 0; j < 4; j++) {
                        p4[j] = sc.nextInt();
                        sum[i] = sum[i] + p4[j];
                    }
                    break;
            }
        }
        ob.MaxElementArray(sum);

    }
    public void MaxElementArray(int[] arr){
        int max;
        int index=0;
        max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }

        }
        System.out.println(""+(index+1)+" "+max);
    }
}
