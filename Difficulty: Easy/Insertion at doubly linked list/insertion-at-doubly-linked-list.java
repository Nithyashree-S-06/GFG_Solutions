/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        Node temp=head;
        for(int i=0; i<p && temp!=null; i++){
            temp=temp.next;
        }
        if(temp==null) return head;
        Node n =  new Node(x);
        n.next=temp.next;
        n.prev=temp;
        if(temp.next!=null) temp.next.prev=n;
        temp.next=n;
        return head;
    }
}