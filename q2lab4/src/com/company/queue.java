package com.company;

public class queue {
    private final int x=0;
    char []k;

    private int putloc,getloc;
    public queue(char[] chars){

        for(int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }    }
    public queue(queue b){
        k=new char[b.x];
        putloc=b.putloc;
        getloc=b.getloc;
    }
    public queue(int u){
        k=new char[x];
        int putloc=getloc=0;
    }
    public char put(char chara){
        if(putloc==k.length-1){
            System.out.println("  ops  no Space left");
            return 0 ;
        }
        putloc=putloc+1;
        return k[putloc]=chara;
    }
    public void get(){
        if(getloc<putloc||getloc==putloc){
            System.out.println(k[getloc]);
            getloc++;
            return;
        }
        if(getloc>putloc){
            System.out.println("queue empty");
            return;
        }
    }

}


