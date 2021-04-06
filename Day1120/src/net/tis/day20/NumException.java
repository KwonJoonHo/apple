package net.tis.day20;
//155페이지 예외처리 실습
//8번라인 int j = Integer.parseInt(배열명[i])
public class NumException {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] =0;
		try {
			for (int i=0; i<5; i++) {
				intArray[i+1] = i+1 + intArray[i]; //i=4인경우 예외 발생
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
	}//for end
}//main end
}//class END
