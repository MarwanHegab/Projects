
public class Queue<e> {
    private Node<e> head;
    private Node<e> tail;

    private static class Node<e> {
        private e data;
        private Node<e> next;

        public Node(e data) {
            this.data = data;
        }
    }

    public void enqueue(e data) {
        Node<e> newNode = new Node<>(data);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public e dequeue() {
        if (head == null) {
            return null;
        }

        e data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return data;
    }

    public e peek() {
        if (head == null) {
            return null;
        }

        return head.data;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    
}
