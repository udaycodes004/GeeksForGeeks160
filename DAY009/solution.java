class Solution {
    public int getMinDiff(int[] arr, int k) {
        int N = arr.length;

        if (N == 1) return 0;

        
        Arrays.sort(arr);

        int initialDiff = arr[N - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[N - 1] - k;
        
        int minDiff = initialDiff;

        for (int i = 0; i < N - 1; i++) {
            int currentMin = Math.min(smallest, arr[i + 1] - k);
            int currentMax = Math.max(largest, arr[i] + k);

            if (currentMin < 0) continue;

            minDiff = Math.min(minDiff, currentMax - currentMin);
        }

        return minDiff;
    }
}