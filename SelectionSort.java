import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12,15,10,1,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
                int min = findSmallestInArray(arr, i);
                swap(arr, min,i );
            }
        return arr;
        }
    static void swap(int[] arr, int indexOne, int indexTwo){
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    static int findSmallestInArray(int[] arr, int start) {
        int min = start;
        for (int i = start; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }
}
