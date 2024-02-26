public class Main {
    public static void main(String[] args) {
        KadanesMaxSumAlgorithm kadanesMaxSumAlgorithm = new KadanesMaxSumAlgorithm();

        int[] array = {8,-6,10};
        int n = array.length;

        Long maxSum = kadanesMaxSumAlgorithm.solution(array, n);

        System.out.println(maxSum);
    }
}