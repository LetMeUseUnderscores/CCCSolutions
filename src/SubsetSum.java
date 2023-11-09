public class SubsetSum {
    public static boolean findSubsetSum(int[] set, int n, int sum) { //recursion
        if(sum == 0) {
            return true;
        }
        if(n == 0) {
            return false;
        }
        if(set[n - 1] > sum) {
            return findSubsetSum(set, n - 1, sum);
        }
        return findSubsetSum(set, n - 1, sum) || findSubsetSum(set, n - 1, sum - set[n - 1]);
    }
    public static void main(String[] args) {
        int[] set = {3, 34, 4, 12, 5, 2};
        int n = set.length;
        int sum = 9;
        System.out.println(findSubsetSum(set, n, sum));
    }
}
