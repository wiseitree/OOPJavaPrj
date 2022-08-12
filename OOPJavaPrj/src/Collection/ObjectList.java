package Collection;

public class ObjectList {
	
	private Object[] nums;
	private int current;
	
	public ObjectList() {
		nums = new Object[3];
		current = 0;
	}
	
	public void add(Object num) {
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

	public Object get(int index) {
		// TODO Auto-generated method stub
		if(current <= index)
			throw new IndexOutOfBoundsException();
		
		return nums[index];
	}

}