class Solution {
    String modify(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        String vowels = "aeiouAEIOU";
        while (i < j) {
            while (i < j && !vowels.contains(String.valueOf(arr[i]))) {
                i++;
            }
            
            while (i < j && !vowels.contains(String.valueOf(arr[j]))) {
                j--;
            }
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                i++;
                j--;
            }
        }
        
        return new String(arr);
    }
}