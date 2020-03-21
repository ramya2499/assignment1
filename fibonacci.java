package com.tgt.igniteplus;

import java.util.Scanner;

public class fibonacci {

        public static void main(String[] args) {

            int n , t1 = 0, t2 = 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n");
            n = sc.nextInt();
            System.out.print("First " + n + " terms: ");

            for (int i = 1; i <= n; ++i)
            {
                System.out.print(t1 + " , ");

                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }
    }

