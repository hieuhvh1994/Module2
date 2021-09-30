public class Main {
    public static void main(String[] args) {

        Queue e = new Queue();
        e.front = e.rear = null;

        Solution.enQueue(e, 14);
        Solution.enQueue(e, 22);
        Solution.enQueue(e, 6);

        Solution.displayQueue(e);

        Solution.deQueue(e);
        Solution.deQueue(e);

        System.out.println("\n");
        Solution.displayQueue(e);

    }
}
