package sorts;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        int[] numbers = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            numbers[i] = Integer.parseInt(words[i]);
        }
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(numbers));

        MergeSort mergeSort = new MergeSort();
        int[] arr = mergeSort.sort(numbers, 0, numbers.length - 1);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));

    }
}
