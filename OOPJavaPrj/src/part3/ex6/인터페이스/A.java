package part3.ex6.인터페이스;

public class A {
	//private B b;
	private X x;
	
	//나중에 setter가 배터리를 꽂게 됨
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
