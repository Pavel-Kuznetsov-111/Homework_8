import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);

        float[] bigBox = {1.57f, 7.654f, 9.986f};
        System.out.println(bigBox[0]);
        System.out.println(bigBox[1]);
        System.out.println(bigBox[2]);

        int[] arbitrarily = new int[7];
        arbitrarily[0] = 130;
        arbitrarily[1] = 135;
        arbitrarily[2] = 150;
        arbitrarily[3] = 100;
        arbitrarily[4] = 120;
        arbitrarily[5] = 170;
        arbitrarily[6] = 157;
        System.out.println(arbitrarily[6]);
        System.out.println(arbitrarily[1]);
        System.out.println(arbitrarily[4]);
        System.out.println(arbitrarily[3]);
        System.out.println(arbitrarily[5]);
        System.out.println(arbitrarily[0]);
        System.out.println(arbitrarily[2]);

        System.out.println("Задача №2");
        int[] weight2 = new int[]{1, 2, 3};
        weight2[0] = 1;
        for (int ind = 0; ind < weight2.length; ind++) {
            if (ind == weight2.length - 1) {
                System.out.println(weight2[2]);
                break;
            }

            System.out.print(weight2[ind] + ", ");
        }
        System.out.println();

        float[] bigBox2 = {1.57f, 7.654f, 9.986f};
        bigBox2[0] = 1.57f;
        for (int i = 0; i < bigBox2.length; i++) {
            if (i == bigBox2.length - 1) {
                System.out.println(bigBox2[2]);
                break;
            }
            System.out.print(bigBox2[i] + ", ");
        }
        System.out.println();

        int[] arbitrarily2 = new int[5];
        arbitrarily2[0] = 8;
        arbitrarily2[1] = 37;
        arbitrarily2[2] = 18;
        arbitrarily2[3] = 45;
        arbitrarily2[4] = 64;
        for (int i = 0; i < arbitrarily2.length; i++) {
            if (i == arbitrarily2.length - 1) {
                System.out.println(arbitrarily2[4]);
                break;
            }
            System.out.print(arbitrarily2[i] + ", ");
        }
        System.out.println();
        System.out.println("Задача №3");
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i < weight[0]) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ",");
        }
        System.out.println();
        for (int i = bigBox.length - 1; i >= 0; i--) {
            if (i <= bigBox[0] - 1) {
                System.out.println(bigBox[i]);
                break;
            }
            System.out.print(bigBox[i] + ",");
        }
        System.out.println();
        for (int i = arbitrarily.length - 1; i >= 0; i--) {
            if (i == arbitrarily[0]) {
                System.out.println(arbitrarily[i]);
                break;
            }
            System.out.print(arbitrarily[i] + ",");

        }
        System.out.println();
        System.out.println("Задача №4");
        int[] numbers = new int[]{10, 7, 15, 94, 18, 6, 9, 37, 36, 14, 25, 33};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                numbers[i] = numbers[i] + 1;


        }
        System.out.println(Arrays.toString(numbers));


    }


}