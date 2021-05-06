package GridTraveler;

public class GridTraveler {

    public long gridTravel(int m, int n){
        if(m == 1 && n == 1) return 1;
        if(m == 0 || n == 0) return 0;

        return gridTravel(m-1, n) + gridTravel(m, n-1);
    }

    /**
     * Memoized version of grid traveler computing
     * @param m rows in grid
     * @param n columns in grid
     * @param arr array of [m+1][n+1] dimensions
     * @return total number of paths from point 0,0 to m,n
     */
    public long memoizedGridTraveler(int m, int n, long[][] arr){
        if(arr[m][n] != 0) return arr[m][n];
        if(m == 1 && n == 1) return 1;
        if(m == 0 || n == 0) return 0;

        arr[m][n] = memoizedGridTraveler(m -1, n,arr) + memoizedGridTraveler(m, n-1,arr);

        return arr[m][n];
    }

}
