package net.tis.day01;

public class Last {
	public static void main(String[] args) {
		System.out.println("12월 2일 수요일");
		//TestLotto클래스 input()메소드 사용=호출
		//직접접근 X, Non-static메소드 TestLotto.input(); //에러
		TestLotto lotto = new TestLotto(); //필요할때만 heap영역에 로드
		lotto.input();//리턴값을 안받음
		int [] su = lotto.input();//리턴값을 받아요
		//for
		for(int temp: su) {
			System.out.print(temp + " ");
		}
	}//end
}//Last클래스 END
