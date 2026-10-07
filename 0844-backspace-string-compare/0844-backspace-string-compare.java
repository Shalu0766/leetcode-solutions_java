class Solution {
    public boolean backspaceCompare(String s, String t) {

        String a = "";
        String b = "";

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (a.length() > 0) {
                    a = a.substring(0, a.length() - 1);
                }
            } else {
                a += c;
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (b.length() > 0) {
                    b = b.substring(0, b.length() - 1);
                }
            } else {
                b += c;
            }
        }

        return a.equals(b);
    }
}