class Solution {
    void pushZerosToEnd(int[] arr) {
        int n=arr.length;
        int nzi=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                          int temp = arr[nzi];
            arr[nzi] = arr[i];
            arr[i] = temp;
            nzi++;

            }
            
        }
        
        
    }
}