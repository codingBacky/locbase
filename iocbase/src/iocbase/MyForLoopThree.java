package iocbase;

public class MyForLoopThree {
	int start;	
	public void setStart(int start) {	this.start = start;	}
	int end;	
	
	public void setEnd(int end) {	this.end = end;	}
	int incre;	
	public void setIncre(int incre) {	this.incre = incre;	}
		

	public int forLoop(/* bean에 의해서 정의됨 */) {
		int sum = 0;
		
		//spring은 single ton 패턴임으로 bean은 한번만 생성한다. 
		//호출할때 마다 생성하는 것이 아니다.
		//호출될 때마다 end 값은 1씩 증가하게 된다.
		end = end + 1; //->for문 안에서 변경해야 변경값이 저장되지 않는다.
		for (int i = start; i < end ; i += incre) {
			sum = sum + i;
		}
		return sum;
	}
}
