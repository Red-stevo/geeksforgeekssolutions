public class Main {
    public static void main(String[] args) {

        /*Array to hold the number sequence*/
        int [] array = new int[]{1,2,3,4,5,6,7,9,10};//in this array, as we can see, 8 is missing

        /*Getting the n (actual size on the array*/
        int n = array.length; //this will return the number of elements in the array
        /*The n represent the number of integers present, including the missing number.
        * In the operation above, we will get the size of the current number that is not
        * including the missing number, so we will add one to the n to get the needed size.*/

        ++n; //adding one to n


        /*Creating an object of the solution*/
        Solution solution = new Solution();


        //calling the method to get the missing number
        int missingNumber = solution.missingNumber(array,n); //the method should return 8

        System.out.println(missingNumber); //printing the returned value.

    }
}