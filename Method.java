public class Method {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
    }
}

 class Computer {

    public void playMusic(){
        System.out.println("Play...");
    }

    public String pauseMusic(int press){
        return "Pause";
    }
}