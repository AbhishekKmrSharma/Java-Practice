package MultiThreading;
public class DaemonThread {
    public static void main(String[] args) {
        Thread normalThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Normal Thread: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon Thread is running");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Set the daemon thread to be a daemon
        daemonThread.setDaemon(true);

        // Start both threads
        normalThread.start();
        daemonThread.start();

        try {
            Thread.sleep(3000); // Sleep for 3 seconds in the main thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is exiting.");
    }
}
