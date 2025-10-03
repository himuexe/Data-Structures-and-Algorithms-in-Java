package Stacks.Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.EmptyStackException;

// Stack interface
interface StackBasics<T> {
    void push(T item);

    T pop();

    T peek();

    boolean isEmpty();

    int size();

    void clear();
}

// Array-based Stack implementation
class ArrayStack<T> implements StackBasics<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int top;
    private int capacity;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.top = -1;
    }

    @Override
    public void push(T item) {
        if (top == capacity - 1) {
            resize();
        }
        array[++top] = item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = (T) array[top];
        array[top--] = null; // Help garbage collection
        return item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) array[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public void clear() {
        for (int i = 0; i <= top; i++) {
            array[i] = null;
        }
        top = -1;
    }

    private void resize() {
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, capacity);
        array = newArray;
        capacity = newCapacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

// ArrayList-based Stack implementation
class ArrayListStack<T> implements StackBasics<T> {
    private ArrayList<T> list;

    public ArrayListStack() {
        this.list = new ArrayList<>();
    }

    public ArrayListStack(int initialCapacity) {
        this.list = new ArrayList<>(initialCapacity);
    }

    @Override
    public void push(T item) {
        list.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void clear() {
        list.clear();
    }

    // ArrayList specific method
    public void trimToSize() {
        list.trimToSize();
    }
}

// LinkedList-based Stack implementation
class LinkedListStack<T> implements StackBasics<T> {
    private LinkedList<T> list;

    public LinkedListStack() {
        this.list = new LinkedList<>();
    }

    @Override
    public void push(T item) {
        list.addLast(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeLast();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getLast();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void clear() {
        list.clear();
    }

    // LinkedList specific methods
    public void pushFirst(T item) {
        list.addFirst(item);
    }

    public T popFirst() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
}