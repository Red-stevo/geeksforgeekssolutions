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


    /*Modifying the method above to get the pointer at the start and the end of the max_sum_sub_array*/

    public int[] maxSubArraySum(int[] arr){

        long maxSum = Long.MIN_VALUE, sum = 0L;
        int start = 0,end  = 0, startPointer = 0;


        for (int i = 0 ; i < arr.length ; i++) {
            if(sum == 0L)
                start = i;

            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                startPointer = start;
                end = i;
            }


            if (sum < 0) {
                sum = 0;
            }
        }
        return new int[]{startPointer, end};
    }
}
