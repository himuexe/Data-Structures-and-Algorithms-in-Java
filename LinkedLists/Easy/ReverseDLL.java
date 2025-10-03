package LinkedLists.Easy;

public class ReverseDLL {
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void reverse() {
        Node current = head;
        Node prev = null;
        while (current != null) {
            Node next = current.next;
            current.next = current.prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        head = prev;
        if (head != null) {
            tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}