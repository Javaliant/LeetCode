public class Solution {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        int hammingDistance = 0;
        for (int n = x ^ y; n > 0; n >>= 1) {
            hammingDistance += n & 1;
        }
        return hammingDistance;
    }
}