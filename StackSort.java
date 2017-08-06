import java.util.Stack;
public class StackSort{

public static void main(String ars[]){

	Stack<Integer> stack = new  Stack<Integer>();
	Stack<Integer> emptystack = new  Stack<Integer>();
	stack.push(50);
	stack.push(45);
	stack.push(20);
	stack.push(5);
	stack.push(12);

	while(!stack.isEmpty()){
		int stackpopvalue = stack.pop();
		while(!emptystack.isEmpty() && stackpopvalue < emptystack.peek()){
			stack.push(emptystack.pop());				
		}
		emptystack.push(stackpopvalue);
	}

	while(!emptystack.isEmpty()){
		System.out.println(emptystack.pop());
	}
}
}