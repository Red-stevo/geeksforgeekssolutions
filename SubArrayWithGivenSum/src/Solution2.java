import java.util.ArrayList;

//Function to find a continuous subarray which adds up to a given number.
class Solution2
{
    //Function to find a continuous subarray which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = n-1;
        if(arr.length == 0) {
            list.add(-1);
            return list;
        }

        int pointer = start;
        long sum = -1;

        while (start <= end) {
            if (sum < 0) ++sum;

            sum += arr[pointer];

            if (sum == s) {
                list.add(start+1);
                list.add(pointer+1);
                return list;
            }
            if((sum > s) || (pointer >= end)) {
                ++start;
                sum = 0;
                pointer = start;
            }else
                ++pointer;
        }
        list.add(-1);
        return list;
    }
}
