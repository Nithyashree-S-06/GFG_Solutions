/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtBeginning(Node tail, int key) {
        Node n =  new Node(key);
        if(tail==null){
            n.next=n;
            return n;
        }
        n.next=tail.next;
        tail.next=n;
        return n;
    }
}