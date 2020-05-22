package cc.ClassTest.java.zhang;

public class TestExcel {
    public static void main(String[] args) {
    Object[] a1 = {1001,"高七",18,"讲师","2006-2-17"};
    Object[] a2 = {1002,"高小七",19,"助教","2007-10-10"};
    Object[] a3 = {1003,"高大七",20,"班主任","2006-5-6"};
    Object[] []  emps = new Object[3][];
    emps[0] = a1;
    emps[1] = a2;
    emps[2] = a3;

        System.out.println(emps[0]);
        System.out.println(emps[1]);
        System.out.println(emps[2]);
    }
}
