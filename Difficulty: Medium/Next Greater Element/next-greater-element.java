class Solution {
    public ArrayList<Integer> nextLargerElement(int[] A) {
        ArrayList <Integer> ans = new ArrayList<>();
        int n=A.length;
        ans.add(-1);
        Stack <Integer> s = new Stack<>();
        s.push(A[n-1]);
        for(int i=n-2; i>=0; i--){
            int val=A[i];
            while(s.size() != 0 && val>=s.peek()){
                s.pop();
            }
            if(s.size()==0) ans.add(-1);
            else ans.add(s.peek());
            s.push(A[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}