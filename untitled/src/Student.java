public final class Student implements Comparable<Student> {
    public int id;
    public String name;
    public int age;
    public String sex;
    public int price;

    public Student(int id, String name, int age, String sex, int price) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }

    public String toString() {
        return "id:" + this.id + " name:" + this.name + " age:" + this.age + " sex:" + this.sex;
    }

    public int compareTo(Student other) {
        if (this.price > other.price) return 1;
        else if (this.price < other.price) return -1;
        else return 0;
    }
}
