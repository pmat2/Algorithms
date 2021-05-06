package Fibonacci;

public class Fibonacci {

    int size;
    private final long[] fibArray;

    /**
     * Regular Fibonacci.Fibonacci sequence function
     * for n=50 execution takes around 50secs
     * @param whichNumber n-th number of Fibonacci.Fibonacci sequence
     * @return value of n-th number of Fibonacci.Fibonacci sequence
     */
    public long fibonacciSequence(int whichNumber){
        if(whichNumber < 0) throw new IllegalArgumentException("Cannot calculate negative number of Fibonacci.Fibonacci sequence");
        if(whichNumber <= 2) return 1;
        return fibonacciSequence(whichNumber - 2) + fibonacciSequence( whichNumber -1);
    }

    /**
     * Memoized Fibonacci.Fibonacci sequence function
     * After n=93 result is beyond long capabilities
     * @param whichNumber n-th number of Fibonacci.Fibonacci sequence
     * @return value of n-th number of Fibonacci.Fibonacci sequence
     */
    public long fibonacciSequenceMemoized(int whichNumber){
        if(whichNumber < 0) throw new IllegalArgumentException("Cannot calculate negative number of Fibonacci.Fibonacci sequence");

        long fibValue;

        if(whichNumber <= 2){
            return 1;
        } else if (this.fibArray[whichNumber] != 0){
            return this.fibArray[whichNumber];
        } else {
            fibValue = fibonacciSequenceMemoized(whichNumber - 2)+ fibonacciSequenceMemoized(whichNumber - 1);
            this.fibArray[whichNumber] = fibValue;
        }
        return fibonacciSequenceMemoized(whichNumber-2)+ fibonacciSequenceMemoized(whichNumber-1);
    }

    public Fibonacci(int size) {
        this.size = size;
        this.fibArray = new long[size+1];
    }
}

