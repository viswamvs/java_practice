import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    Queue<Integer> q;
    int capacity;

    public BlockingQueue(int cap){
        capacity = cap;
        q = new LinkedList<>();
    }

    public boolean add(int element)  {
        while (q.size() == capacity){
            try {
                q.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        q.add(element);
        q.notifyAll();
        return true;
    }

    public int remove(){
        while (q.size()==0) {
            try {
                q.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        int element = q.poll();
        q.notifyAll();
        return element;
    }
}