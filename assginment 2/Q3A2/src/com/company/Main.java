package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);


        System.out.println("input data for table ");
        int input=key.nextInt();


        ModulusTable ferrari=new ModulusTable(input,12);
        System.out.println("  "+"1"+" "+"2"+" "+"3"+" "+"4"+" "+"5"+" "+"6"+" "+"7"+" "+"8"+" "+"9"+" "+"10"+" "+"11"+" "+"12");

        for(int j=0;j<13;j++){
            System.out.print((j+1)+" ");

            for(int i=1;i<13;i++){

                System.out.print(ferrari.toString(i,input,j)+" ");
            }




            System.out.println();
        }
    }}

