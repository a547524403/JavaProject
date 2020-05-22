package cc.ClassTest.java.zhang;

public class TestArraysCopy {
    public static void main(String[] args) {
        String[] s = {"阿里","腾讯","京东","网易","搜狐"};
    String[] sBak = new String[6];
    System.arraycopy(s,0,sBak,0,s.length);
    for (int i = 0; i < sBak.length;i++){
        System.out.println(sBak[i] + "\t");
    }
    }
}
