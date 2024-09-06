import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.LinkedList;

/**
 * Yahya Ahmed Khan 24442
 */
public class Nton {

    private static int N = 3; // maximum number of objects
    private static int currCount = 0; // current number of objects instantiated so far
    private static Queue<Nton> queue = new LinkedList<Nton>();
    private static Semaphore semaphore = new Semaphore(N);

    private Nton() {
    }

    public static Nton getInstance() {
        countInstances();

        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted while waiting for a car");
        }
        // Get first object from the pool/queue
        Nton car = queue.poll();
        return car;

    }

    // checks if maximum number of objects are in the pool, if not, adds a new
    // object
    private static synchronized void countInstances() {
        if (currCount < N) {
            queue.add(new Nton());
            currCount++;
        }
    }

    // returns the nton object to the pool
    public static void releaseInstance(Nton car) {
        if (queue.size() < N) {
            queue.add(car);
            semaphore.release();
        } else {
            throw new RuntimeException("Pool is full, cannot return car");
        }

    }

}
