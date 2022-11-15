public class NineInts {
    public static void main(String[] args) {

        int[] nine = {10, 15, 19, 23, 26, 29, 31, 34, 38};
        //nine[0] = 10;
        //nine[1] = 15;
        //nine[2] = 19;
        //nine[3] = 23;
        //nine[4] = 26;
        //nine[5] = 29;
        //nine[6] = 31;
        //nine[7] = 34;
        //nine[8] = 38;

        for (int i = 0; i < nine.length; i++) {
            System.out.print(nine[i] + " ");
        }
        for (int i = nine.length - 1; i >= 0; i--) {
            System.out.print(nine[i] + " ");
        }

    }
}