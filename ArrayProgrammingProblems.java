// ArrayProgrammingProblems.java

import java.util.*;

public class ArrayProgrammingProblems {

    // 1. Find largest element
    static void largest(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        System.out.println("Largest = " + max);
    }

    // 2. Find smallest element
    static void smallest(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        System.out.println("Smallest = " + min);
    }

    // 3. Sum of array
    static void sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        System.out.println("Sum = " + s);
    }

    // 4. Average of array
    static void average(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        System.out.println("Average = " + (double)s / arr.length);
    }

    // 5. Reverse array
    static void reverse(int[] arr) {
        System.out.print("Reverse: ");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // 6. Check if element exists
    static void search(int[] arr, int key) {
        boolean found = false;
        for (int x : arr)
            if (x == key) found = true;
        System.out.println(key + (found ? " found" : " not found"));
    }

    // 7. Count even and odd
    static void evenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int x : arr)
            if (x % 2 == 0) even++;
            else odd++;
        System.out.println("Even = " + even + ", Odd = " + odd);
    }

    // 8. Second largest
    static void secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
            }
        }
        System.out.println("Second Largest = " + second);
    }

    // 9. Sort array
    static void sort(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        System.out.println("Sorted = " + Arrays.toString(copy));
    }

    // 10. Remove duplicates
    static void removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : arr) set.add(x);
        System.out.println("Without Duplicates = " + set);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 2, 10, 3, 8, 6};

        largest(arr);
        smallest(arr);
        sum(arr);
        average(arr);
        reverse(arr);
        search(arr, 10);
        evenOdd(arr);
        secondLargest(arr);
        sort(arr);
        removeDuplicates(arr);
    }
}
