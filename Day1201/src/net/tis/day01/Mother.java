package net.tis.day01;

public class Mother {
	public static void cook(int y) { //static�޼ҵ�=Ŭ�����޼ҵ� 
		System.out.println("��Ű�߻��⵵ "+y);
	}//end
	
	public int getTotal() { //non-static�޼ҵ�
		int m=789;
		return m;		
	}//end
}//class END
