class Solution {
    public int minFlips(int a, int b, int c) {
        int or = (a|b);
        int xor = (or^c);
        int and = (a&b);
        int dand = (xor&and);
        return Integer.bitCount(xor)+ Integer.bitCount(dand);
    }
}