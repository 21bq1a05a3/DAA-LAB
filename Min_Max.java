import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Pair minMax = findMinMax(array);

        System.out.println("Minimum element: " + minMax.min);
        System.out.println("Maximum element: " + minMax.max);

        scanner.close();
    }

    public static Pair findMinMax(int[] arr) {
        if (arr.length == 0) {
            return new Pair(-1, -1); 
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new Pair(min, max);
    }

    static class Pair {
        int min;
        int max;

        public Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }
}
