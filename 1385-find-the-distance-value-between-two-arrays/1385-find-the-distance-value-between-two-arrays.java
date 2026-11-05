class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for (int n : arr1){
            if (isValid(n, arr2, d)){
                res++;
            }
        }
        return res;
    }
    private boolean isValid(int n, int[] arr, int d){
        int low = n - d;
        int high = n + d;
        for (int e : arr){
            if (e >= low && e <= high){
                return false;
            }
        }
        return true;
    }
}