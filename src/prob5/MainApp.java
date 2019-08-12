package prob5;

public class MainApp {

	//동적 Stack 
	//배열 공간이 다 차면 자동으로 늘려줘야 한다.
	//배열 기반으로 사용!!!
	
	//예외처리
	//Throw !!!
	public static void main(String[] args) throws Exception {
		try {
			MyStack stack = new MyStack(3);
			
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			while (stack.isEmpty() == false) {
				String s = stack.pop();
				System.out.println( s );
			}

			System.out.println("======================================");

			stack = new MyStack<String>(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		} catch ( MyStackException ex) {
			System.out.println( ex );
		}

	}

}
