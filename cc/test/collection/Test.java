package cc.test.collection;

import java.util.*;

public class Test {
    public void listToMap() {
        List<Student> stu = new ArrayList<>();

        Student student1 = new Student(1001,"张三",18,"男",110);
        Student student2 = new Student(1002,"李四",16,"男",120);
        Student student3 = new Student(1003,"高七",17,"女",90);
        Student student4 = new Student(1004,"小美",19,"女",70);
        Student student5 = new Student(1005,"小四",15,"男",120);
        Student student6 = new Student(1006,"小三",20,"女",85);

        Map<Integer,Student> map = new HashMap<Integer, Student>();

        stu.add(student1);
        stu.add(student2);
        stu.add(student3);
        stu.add(student4);
        stu.add(student5);
        stu.add(student6);

        for (Student ss : stu){
            map.put(ss.getId(),ss);
        }
            Set<Map.Entry<Integer,Student>>  entrySet = map.entrySet();
            for (Map.Entry<Integer,Student> en : entrySet){
                System.out.println(en);
            }
        stu.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });


            System.out.println(stu.toString());
    }

    public void mapToList(){
        Map<Integer, Student> maps = new HashMap<Integer, Student>();
        maps.put(1001,new Student(1001,"张三",18,"男",110));
        maps.put(1002,new Student(1002,"李四",16,"男",120));
        maps.put(1003,new Student(1003,"高七",17,"女",90));
        maps.put(1004,new Student(1004,"小美",19,"女",70));
        maps.put(1005,new Student(1005,"小四",15,"男",120));
        maps.put(1006,new Student(1006,"小三",20,"女",85));

        List<StudentEntry> list = new ArrayList<>();

        for (Integer key : maps.keySet()){
            list.add(new StudentEntry(key,maps.get(key)));
        }

        for (StudentEntry v : list){
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.listToMap();
        Test test01 = new Test();
        test01.mapToList();
    }
}