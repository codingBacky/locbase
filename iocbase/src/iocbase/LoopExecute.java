package iocbase;

import java.io.File;
import java.util.Scanner;

public class LoopExecute {
	public static void main(String[] args) throws Exception {
//		MyForLoop one = new MyForLoop();
//		int result = one.forLoop();
//		System.out.println("실행결과 : " + result);
		
		MyForLoop2 two = new MyForLoop2();
//		int result2 = two.forLoop(1, 9, 1);
//		System.out.println("실행결과 : " + result2);
//		result2 = two.forLoop(1, 9, 2);
//		System.out.println("실행결과 : " + result2);//홀수의 합
//		result2 = two.forLoop(2, 9, 2);
//		System.out.println("실행결과 : " + result2);//짝수의 합
//		System.out.println("--------------------------------");
//		
		Scanner scan = new Scanner(new File("loopData.txt"));
		String readData = scan.nextLine();
		String[] dataArr = readData.split(",");
		int twoResult = two.forLoop(
				Integer.parseInt(dataArr[0]), 
				Integer.parseInt(dataArr[1]), 
				Integer.parseInt(dataArr[2])	);
		System.out.println(twoResult);
		
	}
}
