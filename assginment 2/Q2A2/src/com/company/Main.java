package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);

        System.out.println("Enter first integer");
            int one=key.nextInt();

        System.out.println("Enter second integer ");
            int two=key.nextInt();


        Multiplication zain=new Multiplication(one,two);
            int product=zain.total(one,two);

                    System.out.println("the product is : "+product);
    }

}

