package net.tis.day01;

public class TestLotto {
	public static void main(String[] args) {
		TestLotto tl=new TestLotto();
		//input�޼ҵ�,output(int �迭)�޼ҵ�ȣ��
		int [] a = tl.input(); //6�� ���ڵ����� �߻��ؼ� a���� �������
		tl.output(a); //6�����ڸ� �Ű����ڷ� �޾Ƽ� ���
	}//main end
	
	public int[] input(){//6���ζǼ��ڸ� �߻� non-static�Ϲݸ޼ҵ�, ���ϰ��� �迭
		int[] arr = new int [6]; //�迭�� �ڵ����� �ʱⰪ ����
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1); //372������ MathŬ���� static double random(x)
		}
		return arr;
	}//end
	
	public void output(int[] data){//non-static�Ϲݸ޼ҵ�, �Ű�����
		for(int tt : data) {
			System.out.print(tt+" ");
		}
		//for�ݺ��� 23,9,45,17,33,26 ���
	}//end
}//class END
