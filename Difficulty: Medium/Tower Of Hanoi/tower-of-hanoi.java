class Solution {
    public int towerOfHanoi(int n, int s, int d, int h) {
        if(n==0) return 0;
        int cnt=0;
        cnt+=towerOfHanoi(n-1, s, h, d);
        cnt++;
        cnt+=towerOfHanoi(n-1, h, d, s);
        return cnt;
    }
}
