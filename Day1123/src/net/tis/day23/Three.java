package net.tis.day23;

public class Three {

	public static void main(String[] args) {
		//88페이지 비트연산 & | ^ ~ 85페이지 논리연산과 비슷해요
		int a=6, b=4;
		int x = a & b ;
		int y = a | b ;
		int z = a ^ b ;
		// & and 연산 둘다  만족 = true = 1일때 연산
		// | or 연산 둘중에 하나만 만족 = true = 1일때 연산
		// ^ 캐럿 연산 둘다  만족 = true = 1일때 연산
		
		System.out.println(a+"&"+b+"="+x);
		System.out.println(a+"|"+b+"="+y);
		System.out.println(a+"^"+b+"="+z);		
		System.out.println();
			}//main end
	public void note( ) { //Non-static메소드
		//void 키워드가 있으면 내용만 기술 나열, 즉 리턴값 없음
		System.out.println("note메소드");
	}//note end
}//class END
