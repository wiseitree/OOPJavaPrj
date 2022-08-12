package Exception;

public class overEx extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "입력 값의 합이 1000을 넘는 오류가 발생하였습니다.";
	}

}
