package net.tis.day01;

public class Mother {
	public static void cook(int y) { //static메소드=클래스메소드 
		System.out.println("쿠키발생년도 "+y);
	}//end
	
	public int getTotal() { //non-static메소드
		int m=789;
		return m;		
	}//end
}//class END
