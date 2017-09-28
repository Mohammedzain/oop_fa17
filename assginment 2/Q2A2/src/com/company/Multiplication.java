package com.company;

public class Multiplication {


    private int i,j;
    public Multiplication(int one,int two){
        this.i=one;
        this.j=two;
    }
    int total(int a,int b) {
                     int initial = 0;
                        int sum = a;
                            if (b > a) {
                                for (int i = 1; i < (b - a) + 1; i++) {

                                     initial = a + i;
                                        sum = sum * initial;
            }
        }




        else {
                             for (int i = 1; i < (a - b) + 1; i++) {
                                     initial = a - i;
                                        sum = sum * initial;
            }}

                                return sum;


}}
