class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max_count = 0;
        int curr_count = 0;

        for (int num : nums) {

            if (num == 1) {
                curr_count++;
            } 
            else {
                max_count = Math.max(max_count, curr_count);
                curr_count = 0;
            }
        }

        max_count = Math.max(max_count, curr_count);

        return max_count;
    }
}