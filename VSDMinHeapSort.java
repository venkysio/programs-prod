// Heap Sort in Java
public class VSDMinHeapSort {
    public void sort(int arr[]) {
      int n = arr.length;
      for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
      }  
      // Heap sort
      for (int i = n - 1; i >= 0; i--) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;  
        // Heapify root element
        heapify(arr, i, 0);
      }
    }  
      // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    public void heapify(int[] arr, int n, int i) {
        int smallest = i;  // Initialize smallest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] < arr[smallest])
            smallest = l;

        // If right child is larger than smallest so far
        if (r < n && arr[r] < arr[smallest])
            smallest = r;

        // If largest is not root
        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, smallest);
        }
    }
    // Function to print an array
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
        System.out.println();
    }
    //driver code
    public static void main(String args[]) {
        int arr[] = { 1, 12, 9, 5, 6, 10 };
        VSDMinHeapSort hs = new VSDMinHeapSort();
        hs.sort(arr);
        System.out.println("Sorted array by using min heapsort algorithm is");
        hs.printArray(arr);
    }
  }