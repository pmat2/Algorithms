public class Sum {

    /**
     * Wrapper function, passes index 0
     * @param array array of ints
     * @return sum of all elements of array
     */
    public int sumArray(int[] array){
        return sumArray(array, 0);
    }

    /**
     * @param array array of ints
     * @param index passed by wrapper
     * @return sum of all elements of array
     */
    private int sumArray(int[] array, int index){
        if(index >= array.length) return 0;
        return array[index] + sumArray(array, ++index);
    }


}
