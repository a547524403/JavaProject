package cn.junit.test;

public class Add {
    public int add ( int x , int y){
        return x + y;
    }

    public static void main(String[] args) {
        int z  = new Add().add(5,3);
        System.out.println(z);
    }
}
