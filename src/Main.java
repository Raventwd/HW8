public class Main {
    public static void main(String[] args) {
        System.out.println("//Task 1");
        int[] threeNumbers = new int[3];
        threeNumbers[0] = 1;
        threeNumbers[1] = 2;
        threeNumbers[2] = 3;


        double[] floatNums = {1.57, 7.654, 9.986};


        long[] longest = {1, 2, 3, 4};


        System.out.println("//Task 2");


        for (int i = 0; i < 3; i++) {
            System.out.print(threeNumbers[i] + ", ");
        }


        for (int i = 0; i < 3; i++) {
            System.out.print(floatNums[i] + ", ");
        }


        for (int i = 0; i < 3; i++) {
            System.out.print(longest[i] + ", ");
        }



        System.out.println(" ");
        System.out.println("//Task 3");
        for (int i = 2; i >= 0; i--) {
            System.out.print(threeNumbers[i] + ", ");
        }


        for (int i = 2; i >= 0; i--) {
            System.out.print(floatNums[i] + ", ");
        }


        for (int i = 2; i >= 0; i--) {
            System.out.print(longest[i] + ", ");
        }

        System.out.println(" ");
        System.out.println("//Task 4");
        for (int i = 0; i < threeNumbers.length;i++ ) {
            if(threeNumbers[i] % 2 !=0){
                threeNumbers[i]+=1;
                System.out.print(threeNumbers[i] + ", ");
            }
            else {
                System.out.print(threeNumbers[i] + ", ");
            }
        }
    }
}