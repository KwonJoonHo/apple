package net.tis.day02;

import java.util.Calendar;

public class TestJumin {
		public static void main(String[] args) {
			String msg=""; //지역변수는 사용시 초기화 권장
			int age=0; //지역변수는 사용시 초기화 권장			
			String jumin1="891214-1793485";
			//String jumin2="030730-3693485";
			Calendar cc = Calendar.getInstance(); 
			int year = cc.get(Calendar.YEAR);//2020
			//문제 성별 리턴값 char charAt(int매개인자)
			char gender = jumin1.charAt(7);
			int my =Integer.parseInt(jumin1.substring(0,2));
//			if(gender=='1' || gender=='2') {
//				System.out.println(year-1899-Integer.parseInt(jumin1.substring(0,2)));
//			} //2020-1900+89
//			else if(gender=='3' || gender=='4') {
//				System.out.println(year-1999-Integer.parseInt(jumin1.substring(0,2)));
//			} //2020-2000+03
//			else if(gender=='5' || gender=='6') {
//				System.out.println("외국인입니다.");
//			} //외국인 나이계산 X
//			else {System.out.println("성별이 잘못 기술되었습니다."); }//성별을 잘못기술한 경우
			
			switch(gender) {
			case '1' :
			case '2' : 
				age=year-1899-my; break;
			case '3' :
			case '4' : 
				age=year-1999-my; break;
			case '5' :
			case '6' : System.out.println("외국인입니다."); break;
			default : msg="성별번호를 다시 확인해주세요"; break;
			}
			System.out.print("\n" +msg);
			System.out.println("현재나이는 " + age + "세 입니다");
			
			String jumin="891214-1793485";
			
	}

}
