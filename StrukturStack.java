package Pertemuan10;

public class StrukturStack {
	 private int[] array;
	    private int capacity;
	    private int TOP;
	    public final int MIN = -1;
	    
	    public boolean isEmpty() {
	        return (TOP == MIN);
	    }

	    public boolean isFull() {
	        return (TOP == capacity - 1);
	    }

	    public int size() {
	        return TOP + 1;
	    }

	    public int top() {
	        if (isEmpty()) {
	            return MIN;
	        } else {
	            return array[TOP];
	        }
	    }
	    
	    public void push(int data) {
	        if (isFull()){
	            System.out.println("Stack Penuh");
	        } else {
	            TOP++;
	            array[TOP] = data;
	        }
	    }
	    
	    public int pop() {
	    if (isEmpty()) {
	        System.out.println("Stack Kosong");
	        return MIN;
	    } else {
	        int poppedElement = array[TOP];
	        TOP--;
	        return poppedElement;
	    }
	}
	    
	    public StrukturStack(int capacity) {
	        super();
	        array = new int[capacity];
	        this.capacity = capacity;
	        TOP = MIN;
	    }
	    
	    public void displayElements() {
	        System.out.println("Elemen From TOP: ");
	        if (isEmpty()) {
	            System.out.println("Stack kososng");
	        } else {
	             for (int i = TOP; i >= 0; i--) {
	            System.out.print(array[i] + " ");
	        }
	            }
	            System.out.println();
	        }
}
