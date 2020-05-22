package com.zhang.test;

//设置类名
class Pots{
//设置成员
    private double Xpots,Ypots,Zpots;
//设置参数
    public Pots ( double x,double y, double z){
//参数向成员 赋值
        Xpots = x;
        Ypots = y;
        Zpots = z;

    }
//设置方法名和方法体
    public void setXpots(double x){
        Xpots = x;
    }

    public void setYpots(double y){
        Ypots = y;
    }

    public void setZpots(double z){
        Zpots = z;
    }
//获取方法名和方法体
    public double getXpots(){
        return Xpots;
    }

    public double getYpots(){
        return Ypots;
    }

    public double getZpots(){
        return Zpots;
    }
//传入一个Pots类去计算
    public double getDisplay(Pots p){
        return (Xpots - p.Xpots) * (Xpots - p.Xpots) + (Ypots - p.Ypots) * (Ypots - p.Ypots) + (Zpots - p.Zpots) * (Zpots - p.Zpots);
    }
//打印
    public void display(){
        System.out.println( Xpots + Ypots + Zpots);
    }
}

//主函数
public class Tps {
    public static void main(String[] args) throws Exception {
        Tps tps = new Tps();
        Pots p = new Pots(1.0,2.0,3.0);
        Pots p1 = new Pots(22.0,31.0,22.2);
        System.out.println(p.getDisplay(p1));


    }

    public void change1(double a){

    }
}
