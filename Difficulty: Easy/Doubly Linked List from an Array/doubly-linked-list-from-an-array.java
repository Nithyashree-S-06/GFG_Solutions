/* class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
} */

class Solution {
    public Node createDLL(int arr[]) {
        Node head=null;
        Node tail=null;
        for(int i=0; i<arr.length; i++){
            Node n=new Node (arr[i]);
            if(head==null){
                head=n; 
                tail=n;
            }
            else{
                n.prev=tail;
                tail.next=n;
                tail=n;
            }
        }
        return head;
    }
}