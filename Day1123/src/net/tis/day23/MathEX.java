package net.tis.day23;
import java.lang.Math;
public class MathEX { //372������ �ڵ� ���
	public static void main(String[] args) {
		//372������ Math.random(), RandomŬ���� r = new Random();
		double a = 4.7;
		System.out.println(Math.PI); //������ ��� ���
		System.out.println(Math.ceil(a)); //ceil(�ø�)
		System.out.println(Math.floor(a)); //floor(����)
		System.out.println(Math.sqrt(9)); //������
		System.out.println(Math.exp(1)); //e�� 2��
		System.out.println(Math.round(3.54)); //�ݿø�
		
		// [1, 45] ������ ������ ���� 5�� �߻�
		System.out.println("�̹��� ����� ��ȣ�� ");
		double[] com = new double[6];
		for(int i=0; i<com.length; i++) {
			com[i] = Math.random()*45+1;
			System.out.println("����=" + (int)com[i]);
			//���� 1~10���� ���� 6�� ����
				}//for end
}
}
