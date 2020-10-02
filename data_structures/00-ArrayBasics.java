package data_structures;

import java.util.Arrays; 

class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("ObjectName: " + arr);
        System.out.println("HashCode: " + arr.hashCode());
        System.out.println("Class: " + arr.getClass());
        System.out.println("Array: " + Arrays.toString(arr));

        int[] arr2 = new int[] {1, 4, 3, 7, 2, 9};
        System.out.println("Array2: " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted Array2: " + Arrays.toString(arr2));

        int[] arr3 = new int[10];
        System.out.println("Array3: " + Arrays.toString(arr3));
        Arrays.fill(arr3, 3);
        System.out.println("Array3: " + Arrays.toString(arr3));
    }
}