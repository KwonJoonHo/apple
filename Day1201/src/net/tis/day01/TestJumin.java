package net.tis.day01;

import java.util.Calendar;

public class TestJumin {

	public static void main(String[] args) {
		String jumin="891214-1793485";
		//문제1 나이 2020-1989 Calendar클래스, substring(1,2)
		//리턴값 String 메소드substring(int,int) non-static메소드
		String a = jumin.substring(0,2); //String 리턴값 substring(0번째 시작, 2번째 앞까지)		
		int age = 120 - (Integer.parseInt(a));
		System.out.println("당신의 나이는"+(age+1)+"세 입니다");
		//문제2 성별 char charAt(int)
		String msg="";
		char s = jumin.charAt(7);
		if(s=='1' || s=='3') {msg="남성";}
		else if (s=='2' || s=='4') {msg="여성";}
		else if (s=='5' || s=='6') {msg="외국인";}
		else {msg="잘못입력한 사람";}
		System.out.println("당신은 " +msg+" 입니다.");
		//문제3 생년월일 12월 30일
		//substring(시, 끝+1) 메소드 사용 당신의 생일은 12월 30일 입니다.
		String bm = jumin.substring(2,4);
		String bd = jumin.substring(4,6);
		System.out.println("당신의 생일은 "+bm+"월 " + bd + "일 입니다.");
		
		//문제4 6자릿수 - 7자릿수
		String jumin1="951230"; //6자릿수
		String jumin2="1793485"; //7자릿수
		int size1 = jumin1.length();
		int size2 = jumin2.length();
		if(size1==6 && size2==7) {
			System.out.println(jumin1+"-"+jumin2);
		} else {
			System.out.println("당신의 주민번호 자릿수가 이상합니다.");
			System.out.println(jumin1+"-"+jumin2);
		}
				
		//문제5 키보드에서 입력	
	}//main end
}
