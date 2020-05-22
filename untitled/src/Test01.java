import java.util.*;

public class Test01 {
    public static void listToMap() {
        //System.out.println("-----------------listToMap-------------");
        List<Student> list = new ArrayList<Student>(){{
            add(new Student(1001, "zhangsan", 18, "male", 110));
            add(new Student(1002, "lisi", 16, "male", 120));
            add(new Student(1003, "gaoqi", 17, "female", 90));
            add(new Student(1004, "xiaomei", 19, "female", 70));
            add(new Student(1005, "xiaosi", 15, "female", 120));
            add(new Student(1006, "xiaosan", 20, "female", 85));
        }};
        
        Map<Integer,Student> map = new HashMap<Integer, Student>();
        for (Student item : list){
            map.put(item.id, item);
        }
        map.forEach((k, v) -> System.out.printf("key= %d, value= %s \n", k, v));
        System.out.println();

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.price- o2.price;
            }
        });

        System.out.println(list.toString());
    }

    public static void mapToList(){
        //System.out.println("-----------------mapToList-------------");
        Map<Integer,Student> map = new HashMap<Integer, Student>(){{
            put(1001, new Student(1001, "zhangsan", 18, "male", 110));
            put(1002, new Student(1002, "lisi", 16, "male", 120));
            put(1003, new Student(1003, "gaoqi", 17, "female", 90));
            put(1004, new Student(1004, "xiaomei", 19, "female", 70));
            put(1005, new Student(1005, "xiaosi", 15, "female", 120));
            put(1006, new Student(1006, "xiaosan", 20, "female", 85));
        }};

        List<StudentEntry> list = new ArrayList<>();
        for(Integer key : map.keySet()){
            list.add(new StudentEntry(key, map.get(key)));
        }
        list.forEach((v) -> System.out.println(v));
        System.out.println();
    }

    public static void main(String[] args) {
        Test01.listToMap();
        Test01.mapToList();
    }
}