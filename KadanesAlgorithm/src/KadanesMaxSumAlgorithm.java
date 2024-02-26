public class KadanesMaxSumAlgorithm {
    public Long solution(int[] arr, int n){
        /*Variables*/
        long oldSum;
        long maxSum = oldSum = Long.MIN_VALUE, currentSum = 0L, workingSum;

        /*the algorithm*/
        for(int num : arr)
        {
            /*Update the current sum.*/
            currentSum += num;
            if(num > currentSum && num > oldSum)
            {
                workingSum = num;
                oldSum = num;
                currentSum = num;
            }else if(oldSum > currentSum)
            {
                workingSum = oldSum;
                oldSum = num;
                currentSum= num;
            }
            else {
                workingSum = currentSum;
                oldSum = currentSum;
            }

           /* if(currentSum > oldSum && currentSum >= num || currentSum > 0)
            {
                workingSum = currentSum;
                oldSum = currentSum;
            }else if(oldSum > num)
            {
                workingSum = oldSum;
                oldSum = num;
                currentSum= num;
            }
            else
            {
                workingSum = num;
                oldSum = num;
                currentSum = num;
            }*/
            if(workingSum > maxSum)
            {
                maxSum = workingSum;
            }
        }
        return maxSum;
    }
}
