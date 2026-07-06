class Solution {
    public List<String> extractInt(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder num = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                if (num.length() > 0) {
                    result.add(num.toString());
                    num.setLength(0); 
                }
            }
        }
        
        if (num.length() > 0) {
            result.add(num.toString());
        }
        
        return result;
    }
}