package net.tis.day01;

public class TestJumin3 {
	public static void main(String[] args) {
		String jumin="891214-1793485";
		
		//int indexOf(���ڿ�"-")
		int pos = jumin.indexOf("-"); //6���
		System.out.println("��ġ = " + pos);
		
		//string substring(����) ���ۺ��� ���������� ����\
		String last = jumin.substring((jumin.indexOf("-")+1));
		System.out.println("*****-"+last);
	}//main end
}
