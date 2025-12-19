public class Method {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.pauseMusic(1);
        System.out.println(str);
    }
}

 class Computer {

    public void playMusic(){
        System.out.println("Play...");
    }

    public String pauseMusic(int press){
        if (press >= 10)
            return "Pause";
        else
            return "nothing ...";
    }
}