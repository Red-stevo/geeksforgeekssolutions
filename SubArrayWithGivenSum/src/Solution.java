import java.util.ArrayList;

class Solution
{
    //Function to find a continuous subarray which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        if(arr.length == 0) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(-1);
            return list;
        }
        // Your code here
        /*Am I going to user recursion to try to solve the problem*/
        return findPoints(arr, 0, n-1,s);
    }


    static ArrayList<Integer> findPoints(int[] arr, int start, int end, int s) {
        int pointer = start;
        long sum = 0L;

        ArrayList<Integer> list = new ArrayList<>();

        if (start <= end) {
            while (sum < s && pointer <= end) {
                sum += arr[pointer];
                ++pointer;
            }
            if (sum == s) {
                list.add(start);
                list.add(pointer-1);
                return list;
            }
            return findPoints(arr, start + 1, end, s);
        }
        else {
            list.add(-1);
            return list;
        }
    }
}