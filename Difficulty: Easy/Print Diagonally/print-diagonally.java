class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        ArrayList<Integer> A=new ArrayList<>();
        int n=mat.length;
        for(int k=0; k<2*n-1; k++){
            for(int i=0; i<n; i++){
                int j=k-i;
                if(j>=0 && j<n) A.add(mat[i][j]);
            }
        }
        return A;
    }
}
