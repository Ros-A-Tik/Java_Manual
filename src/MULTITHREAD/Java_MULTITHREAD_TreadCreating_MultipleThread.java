package MULTITHREAD;

public class Java_MULTITHREAD_TreadCreating_MultipleThread implements Runnable {

    String threadName;
    Thread t;

    Java_MULTITHREAD_TreadCreating_MultipleThread(String thName) {
        threadName = thName;
        t = new Thread(this, threadName);
        System.out.println("The thread name is: " + t.getName());
    }

     public void run () {
        try {
            if (threadName.equals("one")){
                for (int i = 0; i < 5; i++) {
                    System.out.println("The thread \"one\" continence: " + i);
                    Thread.sleep(500);
                }
            } else if (threadName.equals("two")) {
                for (int i = 5; i > 0; i--) {
                    System.out.println("The thread \"two\" continence: " + i);
                    Thread.sleep(1000);
                }
            } else if (threadName.equals("three")) {
                System.out.println("This is thread \"three\". It continence nothing");
                Thread.sleep(1500);
            }
        } catch (Exception e) {
            System.out.println("Second thread exception ia: " + e);
        }
        System.out.println("Exiting from thread " + threadName);
    }
}