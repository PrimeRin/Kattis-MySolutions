package Kattis.com;

import java.util.Scanner;

public class Another_Query_on_Array_Problem {

    public static void main(String []args) {
        Another_Query_on_Array_Problem ob = new Another_Query_on_Array_Problem();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N >= 1 && N <= 100000 && M >= 1 && M <= 100000) {

            int[] arr = new int[N];
            int[] InputValues = new int[M * 3];

            for (int i = 0; i < M * 3; i++) {
                InputValues[i] = sc.nextInt();
            }

            //Initialize the array with zeros
            for (int i = 0; i < N; i++) {
                arr[i] = 0;
            }
            for (int i = 0; i < (M * 3) - 2; i++) {
                int x = InputValues[i + 1] - 1;
                int y = InputValues[i + 2];

                if (InputValues[i] == 0) {
                    int p = ob.Case1(arr, x, y);
                    System.out.println(p);
                } else if (InputValues[i] == 1) {
                    arr = ob.Case2(arr, x, y);
                } else if (InputValues[i] == 2) {
                    arr = ob.Case3(arr, x, y);
                }
                i = i + 2;
            }
        }
    }

    public int Case1(int []arr,int a,int b){
        int sum=0;
        for(int i=a;i<b;i++){
            sum=sum+arr[i];
        }
        sum=(sum%1000000007);
        return (sum);
    }

    public int[] Case2(int []arr,int a,int b){
        int count=1;
        for(int i=a;i<b;i++){
            arr[i]=arr[i]+(count*(count+1)*(count+2));
            count++;
        }
        return arr;
    }
    public int[] Case3(int []arr,int a,int b){
        int count=1;
        for(int i=a;i<b;i++){
            arr[i]=arr[i]-(count*(count+1)*(count+2));
            count++;
        }
        return arr;
    }
}
