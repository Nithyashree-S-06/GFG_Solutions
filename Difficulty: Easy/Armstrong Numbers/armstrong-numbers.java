class Solution {
    static boolean armstrongNumber(int n) {
        int sumval=sumOfDigits(n);
        return (sumval==n)?true:false;
    }
    
    static int countD(int n){
        int cnt=0;
        int div=1;
        while(div<=n){
            cnt++;
            div=div*10;
    }
    return cnt;
    }
    
    static int sumOfDigits(int n){
        int c = countD(n);
        int div=1;
        int sum=0;
        while(div<=n){
            int ld=n%(div*10)/div;
            sum=sum+(int)Math.pow(ld,c);
            div=div*10;
        }
        return sum;
    }
        
    
}