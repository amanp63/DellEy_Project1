package ey_class5;
import java.util.Stack;

public class StackClass<T> { // Make the class generic
    private Stack<T> stack;

    public StackClass() {
        stack = new Stack<>();
    }

    public void push(T item) {
        stack.push(item);
    }

    public T pop() {
        return stack.pop();
    }

    public static void main(String[] args) {
        StackClass<Integer> st = new StackClass<>();

        showPush(st, 45);
        showPush(st, 46);
        showPush(st, 47);
        showPop(st);
        showPop(st);
        showPop(st);
    }

    static void showPush(StackClass<Integer> st, int a) {
        st.push(a);
        System.out.println(st);
    }

    static void showPop(StackClass<Integer> st) {
        st.pop();
        System.out.println(st);
    }
}