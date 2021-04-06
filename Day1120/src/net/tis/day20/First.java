package net.tis.day20;

public class First {

	public static void main(String[] args) {
		// 배열의 초기화, new키워드는 메모리 heap 영역에 로드 =
		// heap영역은 실행중에 로드, 비사용일때 소거
		String city[] = new String[5]; // null
		boolean[] camp = new boolean[5]; // false
		int[] su = new int[5]; //0
		double[] rate = new double[5]; //0.0
		char[] ck = new char [5] ;
		byte[] bt = new byte [5] ;
		for(int cnt=0; cnt<5; cnt=cnt+1) {
			//System.out.println(city[cnt] + " ");
			//System.out.println(camp[cnt] + " ");
			//System.out.println(su[cnt] + " ");
			//System.out.print(rate[cnt] + " ");
			//System.out.println(ck[cnt] + " ");
			System.out.println(bt[cnt] + " ");
		}
				

	}

}
