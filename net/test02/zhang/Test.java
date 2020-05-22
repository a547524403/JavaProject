package net.test02.zhang;

public class Test {
    public static void test(){
        Piano a1 = new Piano();
        Erhu a2 = new Erhu();
        Violin a3 = new Violin();

        Musician a = new Musician();
        a.play(a1);
        a.play(a2);
        a.play(a3);
    }

    public static void main(String[] args) {
        Test.test();
    }
}
