class Solution {
    static ArrayList<Integer> maxSum(int[] A, int k) {
        ArrayList <Integer> ans=new ArrayList<>();
        ans.add(-1);
        ans.add(-1);
        int i=0, j=A.length-1;
        int max=0;
        Arrays.sort(A);
        while(i<j){
            int sum=A[i]+A[j];
            if(sum<k){
                if(sum>max){
                    max=sum;
                    ans.clear();
                    ans.add(A[i]);
                    ans.add(A[j]);
                }
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
        
    }
}