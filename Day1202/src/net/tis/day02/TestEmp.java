package net.tis.day02;

public class TestEmp {
	public String name;//전역변수 =필드 =field
	
	public static void main(String[] args) {
		//TestEmp.java문서 멤버필드=전역변수 유리
		System.out.println("TestEmp 10:50");
		TestEmp te = new TestEmp() ;
		te.setName("또치");		
//		String a = te.getName();
//		System.out.println("이름=" + a);
		String data = te.getName();
		System.out.println("최종데이터="+data);
//		te.setAge(27);
//		int b = te.getAge();
//		System.out.println("나이=" + b);
	}//main end
	
	public void setName(String name) {
		//출력금지 System.out.println("넘어온이름="+ss);
		//전역변수한테 매개인자 전달해요
		this.name = name; // 전역변수한테 전달했으니 Non-static메소드에서 사용가능
	}//end
	
	public String getName() {		
		//출력금지 System.out.println("getName메소드 이름=" + name);
		//전역변수 필드값을 메소드 이름한테 던져요 return 필드
		//return 값 타입으로 메소드가 값을 기억
		return this.name;
	}
}//class END
