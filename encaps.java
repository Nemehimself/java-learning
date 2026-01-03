public class encaps {
    public static void main(String[] args) {
       Human obj = new Human();
        System.out.println( obj.getName() + ":" + obj.getAge() );
    }
}

class Human {
    private int age = 11;
    private String name = "Val"; 

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}