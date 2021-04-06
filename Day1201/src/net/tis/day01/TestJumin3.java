package net.tis.day01;

public class TestJumin3 {
	public static void main(String[] args) {
		String jumin="891214-1793485";
		
		//int indexOf(문자열"-")
		int pos = jumin.indexOf("-"); //6출력
		System.out.println("위치 = " + pos);
		
		//string substring(시작) 시작부터 마지막까지 나옴\
		String last = jumin.substring((jumin.indexOf("-")+1));
		System.out.println("*****-"+last);
	}//main end
}
