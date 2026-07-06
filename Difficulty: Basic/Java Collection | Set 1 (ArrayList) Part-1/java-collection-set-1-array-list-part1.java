class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> ql){
                                 ArrayList <Integer> ans = new ArrayList<>();
                                 if(Q==1){
                                     int pos=ql.get(0);
                                     int val=ql.get(1);
                                     A.add(pos, val);
                                     return A;
                                 }
                                 else{
                                     int index=A.lastIndexOf(ql.get(0));
                                     ans.add(index);
                                     return(ans);
                                 }
        
        
    }
}