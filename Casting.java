public class Casting {
    public static void main(String[] args) {
        
        byte b = 125;
        int a = b;
        byte k = (byte) a;

        float f = 7.5f;
        int t = (int) f; //it will remove the decimal

        System.out.println(a);
        System.out.println(k);
        System.out.println(t);
    }
}
