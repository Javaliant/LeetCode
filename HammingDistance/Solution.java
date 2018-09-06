public class Solution {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        int hammingDistance = 0;
        for (int i = 1; i < 32; i++, x >>= 1, y >>= 1) {
            hammingDistance += (x & 1) ^ (y & 1);
        }
        return hammingDistance;
    }
}