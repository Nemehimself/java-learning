public class Method {
    public static void main(Strings[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        Strings str = obj.pauseMusic(1);
        System.out.println(str);
    }
}

 class Computer {

    public void playMusic(){
        System.out.println("Play...");
    }

    public Strings pauseMusic(int press){
        if (press >= 10)
            return "Pause";
        else
            return "nothing ...";
    }
}