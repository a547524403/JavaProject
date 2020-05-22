package cc.test.collection;

public class Student implements Comparable<Student> {
    int id;
    String name;
    int age;
    String sex;
    int price;

    public Student(int id, String name, int age, String sex ,int price) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public String toString() {
        return "学号：" + this.id + " 姓名：" + this.name + " 年龄：" + this.age + " 性别：" + this.sex + " 分数：" + this.price;
    }

    @Override
    public int compareTo(Student o) {
        return o.price - this.price;
    }
}
