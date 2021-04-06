package net.tis.day01;

public class TestJumin5 {
	public static void main(String[] args) {
		String jumin="891214-1793485";		
		System.out.println("*****-"+jumin.substring((jumin.indexOf("-")+1)));
		
		String a="120000";
		int b = Integer.parseInt(a);		
		int x = 780000;
		String y = String.valueOf(x) ;
		
		String msg="I am a coffee LA LB sk LG kt";
		System.out.println(msg);
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		System.out.println(msg.replace("L", "b"));
		System.out.println(msg.replaceAll(" ", ""));

	}//main end
}
