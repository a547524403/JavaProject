package com.zhang.sxt;

//对象的转型

public class TestCasting {
    public static void main(String[] args) {
        Object obj = new String("赏雪");   //向上可以自动转型

        //obj.charAt(0） 无法调用。编译器认为obj是Object类型而不是String类型
        /*编写程序时，如果想调用运行时类型的方法，只能进行强制类型转换，不然通不过编译器的检查*/

        String str = (String) obj;     //向下转型

        System.out.println(str.charAt(0));  //位于0索引位置的字符
        System.out.println( obj == str);    //true,它们两个运行时是同一个对象
    }
}
