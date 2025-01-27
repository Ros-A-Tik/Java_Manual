package MULTITHREAD;

public class Java_MULTITHREAD_TreadCreating_Thread_Extending_Test {

    public static void main (String[] args) {

        Thread t = Thread.currentThread();
        t.setName("Main Thread");
        System.out.println("The Main Thread name is: " + t.getName());

        Java_MULTITHREAD_TreadCreating_Thread_Extending st = new Java_MULTITHREAD_TreadCreating_Thread_Extending();
        st.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("The Main Thread continence: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("The Main Thread exception is: " + e);
        }
        System.out.println("Exiting from the Main Thread");
    }
}