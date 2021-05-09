package sort;

public class Sort {

    /**
     * Quick sort
     * @param arr array of ints
     * @param beginIndex index of first element
     * @param endIndex index of last element
     */
    public void quicksort(int[] arr, int beginIndex, int endIndex){
        if (beginIndex < endIndex){
            int partitionIndex = partition(arr, beginIndex, endIndex);

            quicksort(arr, beginIndex, partitionIndex-1);
            quicksort(arr,partitionIndex + 1, endIndex);
        }
    }

    /**
     * Pivot function
     * @param arr array of ints
     * @param begin index of first element
     * @param end index of last element
     * @return returns index of pivot
     */
    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int index = (begin - 1);

        for(int j = begin; j < end; j++){
            if(arr[j] <= pivot){
                index++;

                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[index + 1];
        arr[index + 1] = arr[end];
        arr[end] = temp;

        return index + 1;
    }
}
