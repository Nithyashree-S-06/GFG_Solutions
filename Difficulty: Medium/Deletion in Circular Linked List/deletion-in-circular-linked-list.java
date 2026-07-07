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
    Node deleteNode(Node head, int key) {
        if (head == null) return null;
        Node temp = head;
        Node prev = null;
        if (head.data == key) {
            if (head.next == head) {
                return null;
            }
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next; 
            return head;
        }
        temp = head;
        while (temp.next != head && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next.data == key) {
            temp.next = temp.next.next;
        }

        return head;
    }
}