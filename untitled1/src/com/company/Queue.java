package com.company;

public class Queue {
    char []que;
    private int putloc,getloc;

    public Queue(int x){
        que=new char[x];
        int putloc=getloc=0;
    }

    public char put(char A){
        if(putloc==que.length-1){
            System.out.println("  ops  no Space left");
            return 0 ;
        }
        putloc=putloc+1;
        return que[putloc]=A;
    }

    public void get(){


        if(getloc<putloc||getloc==putloc){
            System.out.println(que[getloc]);
            getloc++;
            return;
        }
        if(getloc>putloc){
            System.out.println("queue is empty");
            return;
        }
    }

}
