package net.tis.day20;
//155������ ����ó�� �ǽ�
//8������ int j = Integer.parseInt(�迭��[i])
public class NumException {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] =0;
		try {
			for (int i=0; i<5; i++) {
				intArray[i+1] = i+1 + intArray[i]; //i=4�ΰ�� ���� �߻�
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� ������ ������ϴ�.");
	}//for end
}//main end
}//class END
