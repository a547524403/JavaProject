package cn.test.zhang;

public class MyTraining {
    public static void main(String[] args) {
        Animal a = new Animal("动物", 2) {
            @Override
            public void eat() {

            }
        };
        Bird b = new Bird("鸟",4,300);
        Cat c = new Cat("猫",3,300);
        System.out.println(b);
        animalEat(b);
        animalEat(c);

    }

    static void animalEat(Animal a){
        a.eat();
    }
}
