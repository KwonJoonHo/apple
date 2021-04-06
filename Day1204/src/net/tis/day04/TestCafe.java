package net.tis.day04;

public class TestCafe {
	public static int sum(int n, int m) {
		int hap = n+m;
		return hap;
	}//end
	

	public static void main(String[] args) {
		int data = sum(5,10); //58페이지
		System.out.println(data);
		System.out.println(sum(5,7));
		
		Dunkin dk = new Dunkin();
		//Dunkin 클래스, 
		int price = dk.coffee("카페라떼");
		System.out.println("가격 "+price);
	}

}
