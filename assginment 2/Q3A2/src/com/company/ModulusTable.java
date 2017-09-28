package com.company;

public class ModulusTable {

    private int modulus, ts;

    public ModulusTable(int modulus,int ts) {

        this.ts=ts;
         this.modulus=modulus; }

    public String toString(int i,int no,int j){
        return ""+((i*j)%no);
    }
}
