package MULTITHREAD;

public class Java_MULTITHREAD_isAlive_Test {

    public static void main (String[] args) {

        String th_1_Name = "Thread_1";
        String th_2_Name = "Thread_2";
        String th_3_Name = "Thread_3";

        Java_MULTITHREAD_isAlive th_1 = new Java_MULTITHREAD_isAlive(th_1_Name);
        Java_MULTITHREAD_isAlive th_2 = new Java_MULTITHREAD_isAlive(th_2_Name);
        Java_MULTITHREAD_isAlive th_3 = new Java_MULTITHREAD_isAlive(th_3_Name);

        th_1.t.start();
        th_2.t.start();
        th_3.t.start();

        System.out.println(th_1_Name + ": " + th_1.t.isAlive());
        System.out.println(th_2_Name + ": " + th_2.t.isAlive());
        System.out.println(th_3_Name + ": " + th_3.t.isAlive());
    }
}