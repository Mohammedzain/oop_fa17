package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);


        System.out.println("Enter first integer");
        int one=key.nextInt();

        System.out.println("Enter second integer ");
        int two=key.nextInt();


        SUMM obj=new SUMM(one,two);
        int agg=obj.total(one,two);
        System.out.println("the total is: "+agg);
    }}
