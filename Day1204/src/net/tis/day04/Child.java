package net.tis.day04;

public class Child extends Mother {
	public static void main(String[] args) {
	  //대표적인 추상클래스 Calendar, InputStream
	  //                |-GregorianCalenar자식클래스
	  //에러 Calendar cc = new Calendar();
	  //에러 Mother mm = new Mother(); 
	  //우리가만든 추상클래스 상속해서 사용하라는 의미 
	  //우리가만든 Mother추상클래스는 상속시 추상메소드 재정의
	}//main end

	@Override //생략가능
	public double study() { //재정의=OverRiding
		// TODO Auto-generated method stub
		return 0;
	}//end
	
}//class END


