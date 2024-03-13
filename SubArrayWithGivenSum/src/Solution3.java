import java.util.ArrayList;

public class Solution3 {


    public static ArrayList<Integer> findSubArrayWithAGivenSum(int[] arr, int n, int s){

        ArrayList<Integer> list = new ArrayList<>();

        /*check if the array is empty*/
        if(n == 0){
            list.add(-1);
            return list;
        }

        /*variable to help find the subarray*/
        int start = 0, sum = 0;

        for(int i = 0; i < n ; i++ ){
            if(sum == 0) start = i;

            sum +=arr[i];

            if(sum == s){
                list.add(start);
                list.add(i);
                return list;
            }

            if(sum > s){

            }
        }
        list.add(-1);
        return list;
    }

}
