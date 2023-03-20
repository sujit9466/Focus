package String_Array;

public class Stack {
    private int [] arr;
    private int top;
    private int size;

    public Stack() {
        size = 5;
        top = -1;
        arr = new int[size];
    }

    public Stack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    public boolean isFull() {
        /*if(top == (size -1)) {
            return true;
        }
        else {
            return false;
        }*/

        /*if(top == (size - 1) ) {
            return true;
        }
        return false;*/

        return top == (size -1);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean push(int data) {
        if( isFull() ) {
            return false;
        }

        /*top++;
        arr[top] = data;*/
        arr[++top] = data;

        return true;
    }






    public static void main(String[] args) {

        Stack s = new Stack(4);
        boolean res = s.push(10);

        if(res) {
            System.out.println("Success action");
        }
        else {
            System.out.println("Fail action");
        }
        System.out.println(res);

        int [] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr[0] =10;
        arr [3] = 30;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = new int[4];
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = new int[6];
        arr[0]=4;
       
        arr[5]=90;
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();




        /*float f = 3.145678f;
        //int i = f; //not okay because possible loss of data
        int i = (int) f;
        float f1 = 10; //no loss of data so its okay for java*/


    }
}
