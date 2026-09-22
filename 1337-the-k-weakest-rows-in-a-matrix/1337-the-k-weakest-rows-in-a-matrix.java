class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int m = mat.length;
        int n = mat[0].length;

        int[][] row = new int[m][2];

        for (int i = 0; i < m; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (mat[i][j] == 1) {
                    count++;
                }
            }

            row[i][0] = count;
            row[i][1] = i;
        }

        for (int i = 0; i < m - 1; i++) {

            for (int j = i + 1; j < m; j++) {

                if (row[i][0] > row[j][0] ||
                    (row[i][0] == row[j][0] && row[i][1] > row[j][1])) {

                    int temp = row[i][0];
                    row[i][0] = row[j][0];
                    row[j][0] = temp;

                    temp = row[i][1];
                    row[i][1] = row[j][1];
                    row[j][1] = temp;
                }
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = row[i][1];
        }

        return ans;
    }
}