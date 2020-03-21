package com.tgt.igniteplus;
import java.util.Scanner;
public class prime {

        public static void main(String[] args) {

            int m,n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of m and n");
            m = sc.nextInt();
            n = sc.nextInt();

            while (m < n) {
                boolean flag = false;

                for(int i = 2; i <= m/2; ++i) {

                    if(m % i == 0) {
                        flag = true;
                        break;
                    }
                }

                if (!flag)
                    System.out.print(m + " ");

                ++m;
            }
        }
    }

