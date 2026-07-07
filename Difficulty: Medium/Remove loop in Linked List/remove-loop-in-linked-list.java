/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        Node s=head, f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                f=head;
                while(f!=null && f.next!=null){
                    if(f==s){
                        while(f.next!=s){
                            f=f.next;
                        }
                        f.next=null;
                    }
                    f=f.next;
                    s=s.next;
                }
            }
        }
        
    }
}