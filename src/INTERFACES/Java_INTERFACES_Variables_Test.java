package INTERFACES;

public class Java_INTERFACES_Variables_Test {

    public static void main(String[] args) {

        Java_INTERFACES_Variables_Questions q = new Java_INTERFACES_Variables_Questions();
        Java_INTERFACES_Variables_AskMe a = new Java_INTERFACES_Variables_AskMe();

        a.answer(q.ask());
        a.answer(q.ask());
        a.answer(q.ask());
        a.answer(q.ask());
        a.answer(q.ask());

    }

}
