package generics;

public class MainStack {
	
	public static void main(String[] args) {
		
		Stack<Integer> s1=new Stack<Integer>(6);
		System.out.println(s1.push(1));
		s1.push(2);
		s1.push(3);
        System.out.println(s1.pop());
		
		
	}

}
