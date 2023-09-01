package iocbase;

public class FrontService {
	MyForLoopThree three;
	
	
	public FrontService( MyForLoopThree three ) {
		this.three = three;
	}


	public void work() {
		System.out.println(this.getClass().getName() + "는 서비스 클래스 입니다");
		int result = three.forLoop();
		System.out.println(result);
		System.out.println("bye bye");
	}
}
