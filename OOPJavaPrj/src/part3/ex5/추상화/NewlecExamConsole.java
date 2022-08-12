package part3.ex5.�߻�ȭ;

import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		// TODO Auto-generated method stub
		return new NewlecExam();
	}

	@Override
	protected void onPrint(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam;
		int com = newlecExam.getCom();
		System.out.printf("��ǻ��: %d\n",com);
	}

	@Override
	protected void onInput(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam;
		
		Scanner scan = new Scanner(System.in);
		int com;
		
		do {
			System.out.printf("��ǻ�� :");
			com = scan.nextInt();
			
			if(com < 0 || 100 < com)
			
				System.out.println("��ǻ�ͼ����� 0~100������ ������ �Է��� �����մϴ�.");
			
		}while(com<0 || 100 < com);
		
		newlecExam.setCom(com);
	}

}
