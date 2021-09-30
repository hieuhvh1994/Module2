import java.util.EmptyStackException;

public class Solution {
    public static void enQueue(Queue e, int value ) {
        Node temp = new Node();
        temp.data = value;

        if (e.front == null) {
            e.front = temp;
        } else {
            e.rear.link = temp;
        }

        e.rear = temp;
        e.rear.link = e.front;
    }

    public static void deQueue(Queue e) {
        if (e.front == null) {
            throw new EmptyStackException();
        }

        int value;
        if (e.front == e.rear) {
            e.front =null;
            e.rear = null;
        }
        else {
            Node temp = e.front;
            e.front =e.front.link;
            e.rear.link = e.front;
        }

    }

    public static void displayQueue(Queue e) {
        Node temp = e.front;
        System.out.printf("Elements in Circular Queue are: ");
        while (temp.link != e.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d ", temp.data);
    }
}
