package iocbase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LoopExecutThree {
	//tomcat이 main을 가지고 있다가 호출해줌 읽는 작업을 직접해줌, wep.xml에서 context=param에서 root.xml연결해주면 빈등록이 이미되어있음
	public static void main(String[] args) {
		//설정정보가 어디있는지 알려줘야한다.
		ApplicationContext context =new GenericXmlApplicationContext("appbean.xml");//빈등록
		//appbean.xml에서 객체를 가져와서 MyForLoodThree에게 일을 시킨다.
		MyForLoopThree loopThree = (MyForLoopThree) context.getBean("myForLoopThree");//빈에 이 자료를 줘야함, autowierd역할
		
		int result = loopThree.forLoop();
		System.out.println(result);
		
		System.out.println("한 단계 더 거치는 예제");
		FrontService fs= (FrontService)context.getBean("service");
		fs.work();
	}
}
