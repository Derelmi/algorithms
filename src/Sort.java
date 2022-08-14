public class Sort {
        public static void bubbleSort(int [] sort_arr, int len){

                for (int i=0;i<len-1;++i){

                        for(int j=0;j<len-i-1; ++j){

                                if(sort_arr[j+1]<sort_arr[j]){

                                        int swap = sort_arr[j];
                                        sort_arr[j] = sort_arr[j+1];
                                        sort_arr[j+1] = swap;

                                }
                        }
                }
        }
        public static void insertionSort(int[] arr) {
                for (var i =1; i<arr.length; i++) {
                        var current = arr[i];
                        var j = i - 1;
                        while (j >= 0 && arr[j] > current) {
                                arr[j + 1] = arr[j];
                                j--;
                        }
                        arr[j + 1] = current;
                }
        }

        static void swap(int[] arr, int i, int j)
        {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
        }

        public static int partition(int[] array, int low, int high) {
                int pivot = array[high]; // choose rightmost as pivot
                int i = (low-1);
                //move through all elements and compare with pivot
                for (int j = low; j <= high - 1; j++) {
                        if (array[j] < pivot) {
                                i++; //if element is smaller than pivot, swap with larger element

                                swap(array, i, j);
                        }
                }

                swap(array, i + 1, high);
                return (i + 1);
        }


        static void quickSort(int[] array, int low, int high) {
                if (low < high) {
                        // pi is partitioning index, arr[p]
                        // is now at right place
                        int pi = partition(array, low, high);

                        // Separately sort elements before
                        // partition and after partition
                        quickSort(array, low, pi - 1);
                        quickSort(array, pi + 1, high);
                }
        }

        static void printArray(int[] arr, int size)
        {
                for(int i = 0; i < size; i++)
                        System.out.print(arr[i] + " ");

                System.out.println();
        }
}

