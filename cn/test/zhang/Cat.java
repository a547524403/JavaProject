package cn.test.zhang;

class Cat extends Animal {

    private int runSpeed;
    public String E;

    public Cat(String name,int id,int runSpeed){
        super(name,id);
        this.runSpeed = runSpeed;
    }

    @Override
    public void eat(){
        E = "吃鱼";
        System.out.println(E);
    }

    public void jump(){
        System.out.println("跳");
    }


    @Override
    public String toString(){
        return this.name + " + " + this.id + " + " + this.runSpeed;
    }
}
