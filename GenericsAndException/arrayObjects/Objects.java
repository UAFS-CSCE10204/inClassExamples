package arrayObjects;

public class Objects {
	private Object[] array;
	private int size;
	private int capacity;
	
	public Objects() {
		this.capacity=10;
		array = new Object[this.capacity];
		this.size=0;
	}

	public Object get(int index) {
		Object item=null;
		if(index>=0 && index<size) {
			item = this.array[index];
		}
		return item;
	}
	
	public void append(Object item) {
		if(size<capacity) {
			array[size++] = item;
		}
	}
	
	public void show() {
		int index;
		Object item;
		
		for(index=0;index<size;index++) {
			item = this.array[index];
			System.out.printf("%s\n",item.toString());
		}
	}
	
	
}
