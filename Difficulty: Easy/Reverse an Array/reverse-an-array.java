class Solution {
    public void reverseArray(int A[]) {
        int i=0; int j=A.length-1;
        while(i<j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
       
    }
}

/*class Solution {
    public void reverseArray(int A[]) {
        int i = 0;
        int j = A.length - 1; // Added 'int' here
        
        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        
        // Re-initialized i instead of redeclaring 'int i'
        for (i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}*/