class Solution {
    public String decimalToBase(int b, int n) {
        String ans="";
        while(n!=0){
            int rem=n%b;
            if(rem==10){
                ans='A'+ans;
            }
            else if(rem==11){
                ans='B'+ans;
            }
            else if(rem==12){
                ans='C'+ans;

            }
            else if(rem==13){
                ans='D'+ans;
            }
            else if(rem==14){
                ans='E'+ans;
            }
            else if(rem==15){
                ans='F'+ans;
            }
            else ans=rem+ans;
            n/=b;
        }
        return ans;
    }
}