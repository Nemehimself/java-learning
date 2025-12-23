public class Array {
    public static void main(Strings[] args) {
        int nums [] = {3, 7, 2, 4};

        System.out.println(nums[1]);

        for(int i=0; i<4; i++){
            System.out.println(nums[i]);
        }
        System.out.println();

        //multi-dimensional array
        int multi [][] = new int[3][4];

        for (int k=0; k<3; k++){
            for (int j=0; j<4; j++){

                multi[k][j] = (int)(Math.random() * 10);
                System.out.print(multi[k][j] + " ");
            }
            System.out.println();
        }
         System.out.println();

        //length in array
        int num [] = new int [7];
        num[0] = (int)(Math.random() * 10);
        num[1] = (int)(Math.random() * 10);
        num[2] = (int)(Math.random() * 10);
        num[3] = (int)(Math.random() * 10);

        for(int n=0; n<num.length; n++){
            System.out.println(num[n]);
        }

    }
}
