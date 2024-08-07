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
        int[] weight2 = new int[3];
        weight2[0] = 1;
        weight2[1] = 2;
        weight2[2] = 3;
        System.out.print(weight[0] + ", " + weight[1] + ", " + weight[2]);
        System.out.println();

        float[] bigBox2 = {1.57f, 7.654f, 9.986f};
        System.out.print(bigBox2[0] + ", " + bigBox2[1] + ", " + bigBox2[2]);
        System.out.println();

        int[] arbitrarily2 = new int[7];
        arbitrarily2[0] = 130;
        arbitrarily2[1] = 135;
        arbitrarily2[2] = 150;
        arbitrarily2[3] = 100;
        arbitrarily2[4] = 120;
        arbitrarily2[5] = 170;
        arbitrarily2[6] = 157;
        System.out.println(arbitrarily2[0] + ", " + arbitrarily2[1] + ", " + arbitrarily2[2] + ", " + arbitrarily2[3] + ", " + arbitrarily2[4] + ", " + arbitrarily2[5] + ", " + arbitrarily2[6]);
        System.out.println();
        System.out.println("Задача №3");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        for (int i = 3; i > 0; i--) {
            System.out.print(i + ",");
        }
        System.out.println();
        float[] bigBox3 = {1.57f, 7.654f, 9.986f};
        System.out.print(bigBox3[2] + ", " + bigBox3[1] + ", " + bigBox3[0]);

        System.out.println();
        int[] arbitrarily3 = new int[7];
        arbitrarily3[0] = 130;
        arbitrarily3[1] = 135;
        arbitrarily3[2] = 150;
        arbitrarily3[3] = 100;
        arbitrarily3[4] = 120;
        arbitrarily3[5] = 170;
        arbitrarily3[6] = 157;
        System.out.print(arbitrarily2[6] + ", " + arbitrarily2[5] + ", " + arbitrarily2[4] + ", " + arbitrarily2[3] + ", " + arbitrarily2[2] + ", " + arbitrarily2[1] + ", " + arbitrarily2[0]);
        System.out.println();
        System.out.println("Задача №4");
        int[] numbers = new int[]{10,7,15,94,18,6,9,37,36,14,25,33};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((numbers)[i]);
            if (numbers[i] % 2 != 0)
                numbers[i] = numbers[i] + 1;}
            System.out.println(Arrays.toString(numbers));


    }
}