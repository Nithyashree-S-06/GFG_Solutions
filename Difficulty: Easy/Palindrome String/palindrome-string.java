class Solution {
    boolean isPalindrome(String s) {
        return check(s,0,s.length()-1);
    }
    boolean check(String str, int st, int end){
        if(st>end) return true;
        if(str.charAt(st)==str.charAt(end) && check(str, st+1, end-1)) return true;
        else return false;
    }
}