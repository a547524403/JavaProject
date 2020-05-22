package com.zhang.sxt;

public class TestSuper2 {
    public static void main(String[] args) {
        System.out.println("ChildClassd");
        new ChildClassd();
    }
}

class FatherClassd{
    public FatherClassd(){
        System.out.println("FatherClassd");
    }
}
class ChildClassd extends FatherClassd{
    public ChildClassd(){
        System.out.println("ChildClassd");
    }
}
