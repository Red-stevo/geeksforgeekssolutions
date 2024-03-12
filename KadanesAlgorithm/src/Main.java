public class Main {
    public static void main(String[] args) {

        IKadanesAlgorithm kadanesAlgorithm = new KanadesAlgorithmImpl();

        int[] array = {8,-4,12,-3,-1};
        int n = array.length;

        Long maxSum = kadanesAlgorithm.maxSubArraySum(array, n);

        System.out.println(maxSum);
    }
}