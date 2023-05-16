package stack;
import java.util.Stack;
public class Stackopeartion {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println("Stack: " + stack);
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        stack.push(4);
        System.out.println("Stack after pushing: " + stack);
	}

}
