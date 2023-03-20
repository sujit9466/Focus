package generics;

public class Stack<T> {
	
	private T [] arr;

	private int top;
	private int size;
	
	public Stack(int size) {
		top = -1;
		this.size = size;
		arr = (T []) new Object[size];
	}
	
	
	
	public boolean isempty() {
		
		return top==-1;
		
	}
	
	public boolean isfull() {
		
		return top==(size-1);
		
	}
	
	public boolean push( T data) {
		
		if(isfull()) {
			return false;
		}
		else {
			
			top++;
			arr[top]=data;
			return true;
			
		}
			
		}
		
		public T pop() {
			if(isempty()) {
				return null;
				
			}
			
			
			return arr[top--];
		}
		
	
	
	
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}



	public T[] getArr() {
		return arr;
	}



	public void setArr(T[] arr) {
		this.arr = arr;
	}
	
	
	
	

}
