package com.company;

public class CPUTIMER {

    private int instcount;
    private Double instpersec;

    public CPUTIMER(int II, int cpi, int cps){
        this.instcount=II;
        this.instpersec=(double)cps*1000000;
        instpersec=instpersec/cpi;
    }

    public CPUTIMER(int iC,int IPS){
        this.instcount=iC;
        this.instpersec=(double)IPS;
    }

    // returns the instruction count as stored in the object
    int getIC(){
        return instcount;
    }
    // returns the  instruction per sec
    double getSPI(){
        double x=1/instpersec;
        return x;
    }

    // returns the seconds per program
    double getSec(){

        return instcount*getSPI();
    }
}
