import java.util.Deque;
import java.util.LinkedList;

class HitCounter {
    Deque<Integer> arr;
    public HitCounter() {
        this.arr = new LinkedList<>();
    }
    public void hit(int timestamp) {
        this.arr.add(timestamp);
    }
    
    public int getHits(int timestamp) {
        while (!this.arr.isEmpty() 
            && this.arr.peek() + 300 <= timestamp) this.arr.poll();
        return this.arr.size();
    }
}