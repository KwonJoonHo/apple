package net.tis.day01;


public class First {
	public static void main(String[] args) {
		//final클래스종류 Mother, Scanner, String, Math클래스는 상속X
		//final변수=상수 초기값대입후 변경불가, 상수는 대문자
		final double PLAY_ON = 7.9; //상수
		final double PLAY_OFF = 7.1; //상수
		//PLAY_ON = 10.23; 값 대입을 해서 변경하면 에러가 발생
		//PLAY_OFF = 2.34; 값 대입을 해서 변경하면 에러가 발생
		System.out.println(PLAY_ON);
		System.out.println(PLAY_OFF);
	}
}//class END
