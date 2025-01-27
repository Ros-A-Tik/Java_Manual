package MULTITHREAD;

public class Java_MULTITHREAD_ThreadCreating_Runnable_Tast {
    public static void main (String[] args) {

        Thread t = Thread.currentThread();
        t.setName("Main Thread");
        System.out.println(t.getName());

        Java_MULTITHREAD_ThreadCreating_Runnable st = new Java_MULTITHREAD_ThreadCreating_Runnable();
        System.out.println(st.t.getName());
        st.t.start();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("The Main thread contains: " + i);
                Thread.sleep(2000);
            }
        }catch (Exception e) {
            System.out.println("The Main thread exception is: " + e);
        }
        System.out.println("The Main Thread exiting.");
    }
}
