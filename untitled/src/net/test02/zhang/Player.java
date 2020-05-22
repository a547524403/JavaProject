package net.test02.zhang;

interface Movie {
    void PlayMovie();
}

interface Music {
    void SingMusic();
}

interface  Tv {
    void PlayTv();
}

class Player implements Movie,Music,Tv {

    String name;

    public Player(String name){
        this.name = name;
    }

    public String toString(){
        return "我叫"+ name;
    }

    public void show(){
        System.out.println(toString());
    }

    @Override
    public void PlayMovie() {
        System.out.println("我能演电影");
    }

    @Override
    public void SingMusic() {
        System.out.println("我会唱歌");
    }

    @Override
    public void PlayTv() {
        System.out.println("我能演电视剧");
    }

    public static void main(String[] args) {
    Player a = new Player("杨幂");
    a.show();
    a.PlayMovie();
    a.PlayTv();
    a.SingMusic();
    }
}
