package net.test02.zhang;

class Instrument {
    public void maskSound(){
        System.out.println("play the music");;
    }
}

class Piano extends Instrument{
    public void maskSound(){
        System.out.println("Use Piano to play music");
    }
}

class Violin extends Instrument {
    public void maskSound(){
        System.out.println("Use Violin to play music");
    }
}

class Erhu extends Instrument {

    public void maskSound(){
        System.out.println("Use Erhu to play music");
    }
}
