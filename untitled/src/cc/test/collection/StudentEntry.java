package cc.test.collection;

import java.util.Map;

public class StudentEntry implements Map.Entry<Integer,Student> {
    int key;
    Student value;

    public StudentEntry(int key,Student value){
        this.key = key;
        this.value = value;
    }

    @Override
    public Integer getKey() {
        return this.key;
    }

    @Override
    public Student getValue() {
        return this.value;
    }

    @Override
    public Student setValue(Student value) {
        this.value = value;
        return value;
    }

    public String toString(){
        return "key: "+  this.key + " value: " +this.value;
    }
}
