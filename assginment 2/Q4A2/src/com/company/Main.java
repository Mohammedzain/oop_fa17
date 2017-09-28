package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int c ;

            do{

            CPUTIMER batman;
            System.out.println("chose one 1,2,3");
              c=key.nextInt();
            if(c==1) {
                System.out.println("enter instruction count?");
                int eic = key.nextInt();
                System.out.println("enter cycle per inst?");
                int cpi = key.nextInt();
                System.out.println("speed of clock in MHz?");
                 int scm= key.nextInt();
                batman = new CPUTIMER(eic, cpi, scm);
                System.out.println("sec per programs are " + batman.getSec());
            }


            else if(c==2) {
                System.out.println("enter instruction count ");
                int one = key.nextInt();
                System.out.println("Enter seconds per instruction");
                int two = key.nextInt();
                batman = new CPUTIMER(one, two);
                System.out.println("sec per programs are " + batman.getSec());

            }



                System.out.println("want to run the program again ? yes or no ?");
                String A=key.next();
                if(A.equalsIgnoreCase("no")){
                    System.exit(0);
                }}
            while(c!=3);



        }}
