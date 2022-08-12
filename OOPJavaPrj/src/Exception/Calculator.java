package Exception;

public class Calculator {
	
	public Calculator() {
	}

	public static int add(int x, int y) throws overEx, underEx  {
		
		int result = x + y;
		if(result > 1000)
			throw new overEx();
		
		if(result < 0)
			throw new underEx();
			
		return result;
	}

	public static int sub(int x, int y) throws underEx {
		int result = x - y;

		if(result < 0)
			throw new underEx();
		
		return result;
	}

	public static int multi(int x, int y) {
		return x*y;
	}

	public static int div(int x, int y) {
		return x/y;
	}
	
}