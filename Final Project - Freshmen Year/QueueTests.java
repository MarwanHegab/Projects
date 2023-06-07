import static org.junit.Assert.*;
import org.junit.Test;



public class QueueTests {

    // Testing with strings
    @Test
    public void testEnqueueString() {
        Queue<String> queue = new Queue<String>();
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        assertEquals("first", queue.peek());
    }

    @Test
    public void testDequeueString() {
        Queue<String> queue = new Queue<String>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        assertEquals("A", queue.dequeue());
        assertEquals("B", queue.dequeue());
        assertEquals("C", queue.dequeue());
        assertNull(queue.dequeue());
    }

    @Test
    public void testIsEmptyString() {
        Queue<String> queue = new Queue<String>();
        assertTrue(queue.isEmpty());
        queue.enqueue("first");
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeekString() {
        Queue<String> queue = new Queue<String>();
        assertNull(queue.peek());
        queue.enqueue("first");
        assertEquals("first", queue.peek());
        queue.enqueue("second");
        assertEquals("first", queue.peek());
    }

    // Testing with integers
    @Test
    public void testEnqueueInt() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(Integer.valueOf(1), queue.peek());
    }

    @Test
    public void testDequeueInt() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        assertEquals(Integer.valueOf(5), queue.dequeue());
        assertEquals(Integer.valueOf(6), queue.dequeue());
        assertEquals(Integer.valueOf(7), queue.dequeue());
        assertNull(queue.dequeue());
    }

    @Test
    public void testIsEmptyInt() {
        Queue<Integer> queue = new Queue<Integer>();
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeekInt() {
        Queue<Integer> queue = new Queue<Integer>();
        assertNull(queue.peek());
        queue.enqueue(1);
        assertEquals(Integer.valueOf(1), queue.peek());
        queue.enqueue(2);
        assertEquals(Integer.valueOf(1), queue.peek());
    }


}
