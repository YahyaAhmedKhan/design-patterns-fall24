public class Main {

    public static void main(String[] args) {
        // Create instances
        Nton n1 = Nton.getInstance();
        Nton n2 = Nton.getInstance();
        Nton n3 = Nton.getInstance();

        // Thread to release n3 after 3 seconds
        Thread releaseThread = new Thread(() -> {
            try {
                Thread.sleep(3000); // Wait for 3 seconds
                Nton.releaseInstance(n3);
                System.out.println("n3 released");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to try to get a new instance after releasing n3
        Thread getInstanceThread = new Thread(() -> {
            try {
                Nton n4 = Nton.getInstance();
                System.out.println("n4 obtained: " + n4);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        releaseThread.start();
        getInstanceThread.start();

        try {
            releaseThread.join();
            getInstanceThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
