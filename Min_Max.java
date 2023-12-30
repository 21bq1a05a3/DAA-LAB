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

        findMinMax(array, 0, size - 1);

        scanner.close();
    }

    public static void findMinMax(int[] arr, int left, int right) {
        if (left == right) {
            System.out.println("Minimum element: " + arr[left]);
            System.out.println("Maximum element: " + arr[left]);
        } else if (right - left == 1) {
            int min = Math.min(arr[left], arr[right]);
            int max = Math.max(arr[left], arr[right]);
            System.out.println("Minimum element: " + min);
            System.out.println("Maximum element: " + max);
        } else {
            int mid = left + (right - left) / 2;
            findMinMax(arr, left, mid);
            findMinMax(arr, mid + 1, right);
        }
    }
}
