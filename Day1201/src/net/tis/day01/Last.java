package net.tis.day01;

public class Last {
	public static void main(String[] args) {
		System.out.println("12�� 2�� ������");
		//TestLottoŬ���� input()�޼ҵ� ���=ȣ��
		//�������� X, Non-static�޼ҵ� TestLotto.input(); //����
		TestLotto lotto = new TestLotto(); //�ʿ��Ҷ��� heap������ �ε�
		lotto.input();//���ϰ��� �ȹ���
		int [] su = lotto.input();//���ϰ��� �޾ƿ�
		//for
		for(int temp: su) {
			System.out.print(temp + " ");
		}
	}//end
}//LastŬ���� END
