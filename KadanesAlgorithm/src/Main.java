public class Main {
    public static void main(String[] args) {

        IKadanesAlgorithm kadanesAlgorithm = new KanadesAlgorithmImpl();

        int[] array = {-3,8,-4,12,-3,-1};
        int n = array.length;

        Long maxSum = kadanesAlgorithm.maxSubArraySum(array, n);

        System.out.println(maxSum);


        KanadesAlgorithmImpl kanadesAlgorithm = new KanadesAlgorithmImpl();

        int[] subArray = kanadesAlgorithm.maxSubArraySum(array);

        for(int i : subArray){
            System.out.print(i + "\t");
        }
    }
}