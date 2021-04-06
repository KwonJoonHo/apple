package net.tis.day04;

public abstract class Mother { //추상클래스 
	public static String cook() { //static메소드
	  System.out.println("Mother static String cook");
	  String kind="샌드위치및 간식";
	  return kind;
	}//static메소드 cook
	
	public void cal(int m) { //Non-static메소드
	   System.out.println("Mother void cal(int)");	
	}//non-static메소드 cal
	
	//추상메소드=abstract메소드는 선언만 { }없음
	//메소드 abstract키워드 추가
	//추상메소드가 있으면 자동 추상클래스 abstract class 
	//추상클래스및 interface는 new키워드 사용불가, 
	public abstract double  study() ; //추상메소드 
}//Mother class END








