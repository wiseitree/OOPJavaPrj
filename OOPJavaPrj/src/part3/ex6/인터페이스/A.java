package part3.ex6.�������̽�;

public class A {
	//private B b;
	private X x;
	
	//���߿� setter�� ���͸��� �Ȱ� ��
	public void setX(X x) {
		this.x = x;
	}
	
	public A() {
		//b= new B();
	}
	public void print() {
		//int total = b.total();
		int total = x.total();
		
		System.out.printf("total is %d\n", total);
	}
	
	
}
