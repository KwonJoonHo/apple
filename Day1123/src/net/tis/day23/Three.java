package net.tis.day23;

public class Three {

	public static void main(String[] args) {
		//88������ ��Ʈ���� & | ^ ~ 85������ ������� ����ؿ�
		int a=6, b=4;
		int x = a & b ;
		int y = a | b ;
		int z = a ^ b ;
		// & and ���� �Ѵ�  ���� = true = 1�϶� ����
		// | or ���� ���߿� �ϳ��� ���� = true = 1�϶� ����
		// ^ ĳ�� ���� �Ѵ�  ���� = true = 1�϶� ����
		
		System.out.println(a+"&"+b+"="+x);
		System.out.println(a+"|"+b+"="+y);
		System.out.println(a+"^"+b+"="+z);		
		System.out.println();
			}//main end
	public void note( ) { //Non-static�޼ҵ�
		//void Ű���尡 ������ ���븸 ��� ����, �� ���ϰ� ����
		System.out.println("note�޼ҵ�");
	}//note end
}//class END
