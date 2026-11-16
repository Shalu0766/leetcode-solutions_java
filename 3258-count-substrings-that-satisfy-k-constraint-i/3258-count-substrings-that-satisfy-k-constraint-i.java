class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0;
        int count = 0;
        int zeros = 0;
        int ones = 0;
        for (int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(ch == '0'){
                zeros++;
            }else{
                ones++;
            }
            while (zeros > k && ones > k){
                if (s.charAt(left) == '0'){
                    zeros--;
                }
                if (s.charAt(left) == '1'){
                    ones--;
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}