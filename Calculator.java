public class Calculator {
    public static void main(String[] args) {
        addition objAddition = new addition();
            int result = objAddition.add(2, 3, 5);
            double result1 = objAddition.add(2.5, 3, 5);
            System.out.println(result);
            System.out.println(result1);
    }
}

class addition {

    public int add (int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public int add (int n1, int n2){
        return n1 + n2 ;
    }

    public double add (double n1, int n2, int n3){
        return n1 + n2 + n3;
    }
}