import java.util.LinkedList;

public class MyLinkedList<E> {

    private Node head;
    private int numNodes;

    public MyLinkedList(Node head){
        this.head = head;

    }

    public MyLinkedList(){

    }

    public class Node {
        private Node next;
        private E data;


        public Node(E data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }


    }

    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else if (index >= numNodes) {
            addLast(element);
        } else {
            Node current = head;
            for (int i =0; i < index-1; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = new Node(element);
            current.next.next = temp;

            numNodes++;


        }


    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;

    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;

    }

    public E removeFirst() {
        if (numNodes == 0) {
            return null;
        } else {
            Node temp = head;
            head = head.next;
            numNodes--;

            return temp.data;
        }
    }

    public E removeLast() {
        Node temp;
        Node current = head;
        if (numNodes == 0) {
            return null;
        } else if (numNodes == 1) {
            temp = head;
            head = null;
        } else {
            for (int i = 0; i< numNodes - 2; i++) {
                current = current.next;
            }
            temp = current.next;
            current.next = null;
            numNodes--;


        }
        return temp.data;
    }

    public E remove(int index) {
        Node current = head;
        if (index< 0 || index > numNodes) {
            return null;
        } else if (index ==0) {
            return removeFirst();
        } else if (index == numNodes - 1) {
            removeLast();
        } else {
            Node previous = head;

            for (int i = 0; i< index-1; i++) {
                previous = previous.next;
            }

            current = previous.next;
            previous.next = current.next;
            numNodes--;


        }

        return current.data;

    }

    public boolean remove(E e) {
        boolean result = false;
        Node current = head;
        int index = -1;

        for (int i = 0; i < numNodes -1; i++) {
                if (current.data == e) {
                    index = i;
                }
            }
        if (index != -1) {
            remove(index);
            result = true;
        }


        return result;

        }
    public int size() {
        return numNodes;
    }



    public MyLinkedList clone() {
        Node temp = head;
        MyLinkedList clone = new MyLinkedList();
        clone.addFirst(new Node(temp.data));
        temp = temp.next;
        while (temp !=null) {
            clone.addLast(new Node(temp.data));
            temp = temp.next;
        }
        return clone;
    }



    public E get(int index) {
        Node current = head;
        if (numNodes == 0) {
            return null;
        } else if (numNodes == 1) {
            return current.data;
        } else {
            for (int i=0; i<=index-1;i++) {
                current = current.next;
            }
        }


        return current.data;

    }

    public boolean contains (E o) {
        boolean result = false;
        Node temp = head;
        for (int i=0; i< numNodes; i++) {
            if (temp.data == o) {
                result = true;
            }
        }
        return result;
    }

    public int indexOf (E o) {
        int result = -1;
        Node temp = head;
        for (int i=0; i< numNodes; i++) {
            if (temp.data == o) {
                result = i;
            }
        }
        return result;
    }


    public boolean add(E e) {
        Node temp = new Node(e);

        if (head == null) {
            head = temp;
            numNodes++;
        }  else {
            addLast(e);
        }

        return true;

    }

    public E getFirst() {

        return head.data;

    }

    public E getLast() {
        Node temp = head;
        if (numNodes == 0) {
            return null;
        } else {
            for (int i=0; i<numNodes - 1; i++) {
                temp = temp.next;
            }
        }


        return temp.data;

    }

    public void clear() {
        numNodes = 0;
        head = null;
    }





    }


