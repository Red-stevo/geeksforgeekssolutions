public class KanadesAlgorithmImpl implements IKadanesAlgorithm {
    @Override
    public Long maxSubArraySum(int[] arr, int n) {

        long MAX_VALUE = Long.MIN_VALUE, sum = 0L;

        for(int i : arr){
            sum += i;

            if(sum > MAX_VALUE)
                MAX_VALUE = sum;

            if(sum < 0L)
                sum = 0L;
        }


        return MAX_VALUE; //autoboxing of the wrapper class.
    }
}
