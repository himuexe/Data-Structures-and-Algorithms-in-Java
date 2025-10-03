package LinkedLists.Easy;

public class LinkedListBasics {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
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
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx < 0 || idx > size) {
            throw new IndexOutOfBoundsException();
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node prev = head;
        for (int i = 0; i < idx - 1; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        size--;
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return val;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            return removeFirst();
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        size--;
        int val = tail.data;
        prev.next = null;
        tail = prev;
        return val;
    }
    public int search(int key) {
        if (head == null) {
            return -1;
        }
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}