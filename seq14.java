package com.tgt.igniteplus;
import java.util.Scanner;
public class seq14 {

        public static void main(String[] args){
            int a[]=new int[20];
            a[0]=1;
            a[1]=4;
            a[2]=7;
            int n;
            System.out.print("enter the number of terms: ");
            Scanner in=new Scanner(System.in);
            n=in.nextInt();
            for(int i=3;i<n;i++)
                a[i]=a[i-1]+a[i-2]+a[i-3];
            for(int j=0;j<n;j++)
                System.out.print(a[j]+" ");

        }
    }

