class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int sum=0; int max=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        max=sum;
        int st=1; int end=k;
        while(end<arr.length){
            sum=sum-arr[st-1]+arr[end];
            max=Math.max(sum, max);
            st++;
            end++;
        }
        return max;
        
    }
}