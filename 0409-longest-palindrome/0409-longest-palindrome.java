class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) % 2 == 1){
                count++;
            }else{
                count--;
            }
        }
        if (count > 1){
            return s.length() - count + 1;
        }
        return s.length();
    }
}
