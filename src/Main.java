import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i < 2) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        float[] fract = {1.57f, 7.654f, 9.986f};
        for (int f = 0; f < fract.length; f++) {
            if (f < 2) {
                System.out.print(fract[f] + ", ");
            } else {
                System.out.print(fract[f] + " ");
            }
        }
        System.out.println();

        int[] arbitrary = {7, 12, 25, 47};
        System.out.println(Arrays.toString(arbitrary));


        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;

        for (int i1 = numbers1.length - 1; i1 >= 0; i1--) {
            if (i1 > 0) {
                System.out.print(numbers1[i1] + " ,");
            } else {
                System.out.print(numbers[i1] + "");
            }
        }
        System.out.println();

        float[] fract1 = {1.57f, 7.654f, 9.986f};
        for (int f = fract1.length - 1; f >= 0; f--) {
            if (f > 0) {
                System.out.print(fract1[f] + ", ");
            } else {
                System.out.print(fract1[f] + " ");
            }
        }
        System.out.println();

        int[] arbitrary1 = {7, 12, 25, 47};
        for (int a = arbitrary1.length - 1; a >= 0; a--) {
            if (a > 0) {
                System.out.print(arbitrary1[a] + ", ");
            } else {
                System.out.print(arbitrary1[a] + " ");
            }
        }
        System.out.println();

        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (num[i] % 2 != 0) {
                num[i]++;
                System.out.print(num[i] + ", ");

            }

        }
    }
}





