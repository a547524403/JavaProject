package com.zhang.sxt;

//类型转换有异常

import jdk.nashorn.internal.codegen.ObjectClassGenerator;

public class TestCasting2 {
    public static void main(String[] args) {
        Object obj = new String("赏雪");
        //真实的子类类型是String ，但是此处向下转型为StringBuffer

        StringBuffer str = (StringBuffer) obj;
        System.out.println(str.charAt(0));
    }
}
