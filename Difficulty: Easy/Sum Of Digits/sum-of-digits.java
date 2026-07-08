class Solution {
    static int sumOfDigits(int n) {
        if(n==0) return 0; // if(n<10) return n;
        return n%10 + sumOfDigits(n/10);
    }
}
