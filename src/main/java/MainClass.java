import java.util.Arrays;

public class MainClass {
   // public static int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    //public static int[] arr2;
    public static int four;
    public static boolean isFour = false;
    public static boolean isOne = false;


    public int[] returnArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                four = i;
                isFour = true;
            }
        }
        if (isFour) {
            int[] arr2 = new int[arr.length - four - 1];
            System.arraycopy(arr, ++four, arr2, 0, arr2.length);
            return arr2;
        } else throw new RuntimeException();
    }

    public boolean isOneAndFour(int[] arr) {
        for (int i : arr) {
            if (i == 1) {
                isOne = true;
            } else if (i == 4) {
                isFour = true;
            } else return false;
        }
        return isOne && isFour;
    }
}
