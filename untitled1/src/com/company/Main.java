package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("enter size of Array");
        int input = key.nextInt();


        Queue obj1=new Queue(input);
        System.out.println("insert alphabets to store ");



        for(int i=0;i<input;i++){
            char alphabet=key.next().charAt(0);
            System.out.print("stored "+alphabet);
            obj1.put(alphabet);
        }

        System.out.println("Getting alphabets");
        for(int i=0;i<input+1;i++){
            obj1.get();

        }

    }
}
