import part3.ex4.UI�ڵ�и��ϱ�.Exam;

public class Program {

	// 1.������ -> Exam.class
	// 2.���� -> Exam.zip
	// 3.jar -> Exam.jar
	
	public static void main(String[] args) {
		//Exam exam = new Exam(1,1,1);		
		NewlecExam exam = new NewlecExam(1,1,1,7);
		/*exam.setKor(10);
		exam.setEng(10);
		exam.setMath(10);
		exam.setCom(10);*/
		
		System.out.println(exam.total());
		System.out.println(exam.avg());
	}

}
