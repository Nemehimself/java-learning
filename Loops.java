public class Loops {
    public static void main(String[] args) {
        //Loops - while, For, Do while

        //while loop
        int i = 1;
        
        while(i<=4) 
            {
            System.out.println("Hi " + i);
        //nested while loop
            int j = 1;
            while (j<=3) {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println( "Bye " + i);

        //for loop

        for(int k = 1; k <= 5; k++)
        {   //nested for loop
            System.out.println("Day " + k);

            for(int n = 1; n <= 9; n++)
                System.out.println("    " + (n+8) + " - "+ (n+9));
        }
    }
}
