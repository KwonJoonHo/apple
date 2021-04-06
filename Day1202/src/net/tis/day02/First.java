package net.tis.day02;

public class First {
	public static void main(String[] args) {
		TestEmp emp = new TestEmp() ;
		emp.setName("¸ùºí¶û");
		//ÃÖÁ¾µ¥ÀÌÅÍ ¸ùºí¶û Ãâ·Â		
		String data=emp.getName();
		System.out.println(data);
	}
}
