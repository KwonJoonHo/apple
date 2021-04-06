package net.tis.day20;

public class Father {
	public int pwd=1234; //필드 = 전역변수
	public Father() {//클래스 이름과 동일, 기본생성자=생략가능
		
	}//생성
	public static void main(String[] args) {
		String name = "대부";
		int age = 47;
		System.out.println(name);
		}//main end	
	
	public static void house() { //static메소드
		
	}//house end

	
	
	
	public void bank (){//non-static메소드
		
	}//bank end
	
}