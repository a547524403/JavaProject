package net.test.zhang;

public class NetUser {
    int id;
    int pwd;
    String Email;

    public NetUser(int id,int pwd,String Email){
        this.id = id;
        this.pwd = pwd;
        this.Email = Email;
    }

    public NetUser(int id){
        this.id = id;
        this.Email = this.id + "@gameschool.com";
    }

    public void display(){
        System.out.println("id:" + this.id + " " + "pwd:" + this.pwd + " " +"Email:" + this.Email);
    }

    public static void main(String[] args) {
        NetUser u1 = new NetUser(10,21,"sasses");
        NetUser u2 = new NetUser(0);

        u1.display();
        u2.display();
    }

}
