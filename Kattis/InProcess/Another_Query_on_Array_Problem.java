package Kattis.InProcess;

import java.util.Scanner;

public class Another_Query_on_Array_Problem {

    public static void main(String args[]){
        Another_Query_on_Array_Problem ob=new Another_Query_on_Array_Problem();
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();

        int arr[]=new int[N];
        int InputValues[]=new int[M*3];

        for(int i=0;i<M*3;i++){
            InputValues[i]=sc.nextInt();
        }

        //Initialize the array with zeros
        for(int i=0;i<N;i++){
            arr[i]=0;
        }
        for(int i=0;i<(M*3)-2;i++){
            int start=InputValues[i+1]-1;
            int end=InputValues[i+2];

            if(InputValues[i]==0){
            int x=ob.Case1(arr,start,end);
            System.out.println(x);
            }
            else if(InputValues[i]==1){
             arr=ob.Case2(arr,start,end);
            }
            else if(InputValues[i]==2){
             arr=ob.Case3(arr,start,end);
            }
            i=i+2;
        }

    }
    public int Case1(int arr[],int a,int b){
        int sum=0;
        for(int i=a;i<b;i++){
            arr[i]=arr[i]%1000000007;
            sum=sum+arr[i];
        }
        return sum;
    }

    public int[] Case2(int arr[],int a,int b){
        int count=1;
        for(int i=a;i<b;i++){
            arr[i]=(count*(count+1)*(count+2))+arr[i];
            count++;
        }
        return arr;
    }
    public int[] Case3(int arr[],int a,int b){
        int count=1;
        for(int i=a;i<b;i++){
            arr[i]=arr[i]-(count*(count+1)*(count+2));
            count++;
        }
        return arr;
    }
}
