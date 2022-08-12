package Exception;

public class Program {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = 0;
		try {
			result = Calculator.add(3,4);
			System.out.printf("add: %d\n", result);
			
			result = Calculator.sub(3,4);
		}
		catch(overEx e) {
			//System.out.println(e.getMessage());
			System.out.println("Ưȭ�� ó��");
		}
		catch(Exception e) {
			System.out.println("���� ó��");
		}
		finally {
			System.out.println("�Է� ���� ������ �ֽ��ϴ�.");
		}
		
		System.out.printf("sub: %d\n", result);
		
		result = Calculator.multi(3,4);
		System.out.printf("multi: %d\n", result);
		
		result = Calculator.div(3,4);
		System.out.printf("div: %d\n", result);
		
	}

}