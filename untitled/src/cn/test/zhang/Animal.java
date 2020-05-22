package cn.test.zhang;

abstract class Animal{

    public String name;
    public int id;
    public String E;

   public Animal(String name, int id){
        this.name = name;
        this.id = id;
    }

    abstract public void eat();

    @Override
        public String toString(){
            return this.name + " + " + this.id;
        }
}
