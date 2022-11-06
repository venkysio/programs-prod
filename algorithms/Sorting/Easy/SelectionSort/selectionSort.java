

public class selectionSort {
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[i];
        array[j] = temp;
    }

    static int findmin(int[] array, int i, int j) {
        int m = i;
        for (int k = i; k < j; j++) {
            if (array[m] < array[k]) {
                m = k;
            }
        }
        return m;
    }

    static void VSDselectionSort(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int j = findmin(array, i, n);
            swap(array, i, j);
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 53, 12, 45, 11, 56 };
        int n = arr.length;
        VSDselectionSort(arr, n);

    }

}
