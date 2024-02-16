class Solution {
    int missingNumber(int[] array, int n) {
        /*
        Applying the formulae for the sum 
        of the first n numbers
        sum = (n*n + n)/2
        */

        long sum;
        long sum2 = 0;

        /*Sum all numbers*/
        sum = (((long) n * n) + n)/2;

        /*sum of the given numbers*/
        for(int num : array)
        {
            sum2 +=  num;
        }

        /*finding the missing number.*/
        return (int) (sum - sum2);
    }
}