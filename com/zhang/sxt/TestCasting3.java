package com.zhang.sxt;

//向下转型中使用instanof

public class TestCasting3 {
    public static void main(String[] args) {
        Object obj = new String("赏雪");
        if (obj instanceof String){
            String str = (String) obj;
            System.out.println(str.charAt(0));
        }else if (obj instanceof StringBuffer) {
            StringBuffer str = (StringBuffer) obj;
            System.out.println(str.charAt(0));
        }
    }
}
