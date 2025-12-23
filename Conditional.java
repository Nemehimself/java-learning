public class Conditional {
    public static void main(Strings[] args) {
        //conditional statements
        int x = 20;
        int y = 35;
        int z = 40;

        if (x>y && x>z){
            System.out.println("Moi");
            System.out.println("Tervetolua");
        }
        else if (y>x && y>z)
            System.out.println("Mitä kuuluu");
        else 
            System.out.println("moi moi");

        //ternary operators
        int n = 5;
        int result = 0;

        result = n % 2 == 0 ? 10 : 20;

        System.out.println(result);
    }
}
