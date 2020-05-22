package com.zhang.sxt;

public class TestEquals {
    public static void main(String[] args) {
        Persont p1 = new Persont(123,"高七");
        Persont p2 = new Persont(123,"高小七");
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        String s1 = new String("赏雪");
        String s2 = new String("赏雪");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

class Persont{
    int id;
    String name;
    public Persont(int id , String name){
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object object){
        if (object == null){
            return false;
        }else{
            if(object instanceof Persont){
                Persont c = (Persont)object;
                if (c.id == this.id){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
}