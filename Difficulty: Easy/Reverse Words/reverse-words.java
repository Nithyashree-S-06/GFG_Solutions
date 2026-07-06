class Solution {
    public String reverseWords(String s) {
        String[] A = s.split("\\.");
        StringBuilder rev = new StringBuilder();
        for (int i = A.length-1; i>=0; i--){
            if (A[i].equals("")) {
                continue;
            }
            if (rev.length() > 0) {
                rev.append(".");
            }
            
            rev.append(A[i]);
        }
        
        return rev.toString();
    }
    
}