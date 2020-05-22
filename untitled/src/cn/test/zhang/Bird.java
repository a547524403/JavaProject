package cn.test.zhang;

class Bird extends Animal {

    private int flySpeed;

    public Bird(String name,int id,int flySpeed){
        super(name, id);
        this.flySpeed = flySpeed;
    }

    @Override
    public void eat(){
        E = "吃虫";
        System.out.println(E);
    }

    public void fly() {
        System.out.println("飞");
    }

    @Override
    public String toString() {
        return this.name + " + " + this.id + " + " + this.flySpeed;
    }
}
