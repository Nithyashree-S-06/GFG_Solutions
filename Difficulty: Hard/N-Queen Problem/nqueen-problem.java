class Solution {
    ArrayList <ArrayList<Integer>> ans=new ArrayList<>();
    ArrayList <Integer> temp=new ArrayList<>();
    
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        int chess [][]=new int [n][n];
        solve(chess, 0);
        return ans;
    }
    
    public void solve(int chess[][], int r){
        if(r==chess.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int c=0; c<chess[0].length; c++){
            if(isValidtoPlace_Q(chess, r, c)){
                chess[r][c]=1;
                temp.add(c+1);
                solve(chess, r+1);
                chess[r][c]=0;
                temp.remove(temp.size()-1);
            }
        }
    }
    
    boolean isValidtoPlace_Q(int chess[][], int r, int c){
        for(int i=r-1; i>=0; i--){
            if(chess[i][c]==1) return false;
        }
        for(int i=r-1, j=c-1; i>=0 && j>=0; i--, j--){
            if(chess[i][j]==1) return false;
        }
        for(int i=r-1, j=c+1; i>=0 && j<chess[0].length; i--, j++){
            if(chess[i][j]==1) return false;
        }
        return true;
    }
}