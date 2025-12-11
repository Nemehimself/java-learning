public class Operators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        //Arithemetic Operators
        int add = num1 + num2; // addition
        int sub = num1 - num2; // subtraction
        int mul = num1 * num2; // multiplication
        int div = num1 / num2; // division
        int rem = num1 % num2; // remainder

        //compound assignment operators
         add += 2;
         sub -= 2;
         mul *= 2;
         div /= 2;
         rem %= 2;

        //increment Operators
        int num = 2;
        num++; //post increment
        ++num; //pre increment

        //relational operators
        boolean GT = num1 > num2;
        boolean LT = num1 < num2;
        boolean EQT = num1 == num2;
        boolean NEQT = num1 != num2;
        boolean GTOE = num1 >= num2;
        boolean LTOE = num1 <= num2;

        //Logical operators AND &&, OR ||
        boolean checkOR = num1 > num2 || num1 < num;
        boolean checkAND = num1 > num2 && num1 < num;

        
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
        System.out.println(num);
        System.out.println(GT);
        System.out.println(LT);
        System.out.println(EQT);
        System.out.println(NEQT);
        System.out.println(GTOE);
        System.out.println(LTOE);
        System.out.println(checkOR);
        System.out.println(checkAND);
    }
}
