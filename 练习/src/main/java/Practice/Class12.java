package Practice;

public class Class12 {
    public static void main(String[] args) {
        int[] arr = {22, 33, 44, 55, 66, 77};
        arr(arr);
    }

    public static void arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(",");
        }
    }
}

