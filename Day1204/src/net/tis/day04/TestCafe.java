package net.tis.day04;

public class TestCafe {
	public static int sum(int n, int m) {
		int hap = n+m;
		return hap;
	}//end
	

	public static void main(String[] args) {
		int data = sum(5,10); //58������
		System.out.println(data);
		System.out.println(sum(5,7));
		
		Dunkin dk = new Dunkin();
		//Dunkin Ŭ����, 
		int price = dk.coffee("ī���");
		System.out.println("���� "+price);
	}

}
