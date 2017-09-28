package com.company;

public class SUMM {
    private int i,j;
    public SUMM(int m,int n){
        this.j=n;
        this.i=m;

    }
    int total(int x,int y) {
        int initial = 0;
        int sum = x;


        if (y > x) {
            for (int i = 1; i < (y - x) + 1; i++) {
                initial = x + i;
                sum = sum + initial;
            } }



            else {
            for (int i = 1; i < (x - y) + 1; i++) {
                initial = x - i;
                sum = sum + initial;
            }
        }


        return sum;

    }}
