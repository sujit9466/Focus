public class Queue{
static int array[];
static int size;
static int rear=-1;
   Queue(int n){
	array=new int[n];
	this.size=n;
   }
   
   public  boolean isEmpty() {
	   return rear == -1;
   }
   
   public void add(int data) {
	   if(rear==size-1) {
		   System.out.println("is full");
		   return;
	   }
	   rear++;
	   array[data]=rear;
   }
   
   public int remove() {
	   if(isEmpty()) {
		   System.out.println("empty");
		   return -1;
	   }
	   int front=array[0];
	   for(int i=0;i<rear;i++) {
	   array[i]=array[i+1];
	   
   }
	   rear--;
	   return front;
	   }
   public int peek() {
	   if(isEmpty()) {
		   System.out.println("empty");
		   return -1;
	   }
	   return array[0];
	   
   }
   
   public static void main(String[] args) {
	Queue q= new Queue(5);
	q.add(3);
		q.add(4);
		q.add(4);
		while(q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
}
   

}