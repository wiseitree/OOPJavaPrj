package Collection;

public class GList<T> {
	
	private Object[] nums;
	private int current;
	private int capacity;
	private int amount;
	
	public GList() {
		current = 0;
		capacity = 3;
		amount = 5;
		nums = new Object[capacity];

	}
	
	public void add( T /*Object*/ num) {
		
		if(capacity <= current) {
			Object[] temp = new Object[capacity+amount];
			for(int i=0; i<current; i++)
				temp[i] = nums[i];
			nums = temp;
			capacity += amount;
		}
		
		nums[current] = num;
		current++;
	}

	public void clear() {
		current = 0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return current;
	}

	public T /*Object*/ get(int index) {
		// TODO Auto-generated method stub
		if(current <= index)
			throw new IndexOutOfBoundsException();
		
		return (T) nums[index];
	}

}