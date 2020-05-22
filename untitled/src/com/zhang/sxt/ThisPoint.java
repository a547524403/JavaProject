package com.zhang.sxt;

public class ThisPoint {

    int x,y,z;
    static double round = 3.14;

    public void Tprint(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void printTprint(){
        System.out.println(round);
    }
}
