package net.tis.day20;

public class SJTest{

	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0 ;
		double avg=0.0 ; //���
		String message = "�հ������޼���" ;
		kor = 70 ;
		eng = 60 ;
		//����, ��� ���ؼ� ���
		tot = kor + eng ;
		avg = (double)tot / 2 ;
		
		if (avg >= 70)
			message = "���հ�" ;
		else
			message = "�����" ;
		
		//97������ ���� if ~ else if ~ else
		//90~100 grade='A' 80~89 grade='B'
		//70~79 grade='C' 60~69 grade='D' 0~59 grade='F'
		//98������ �����ϸ鼭
		
		String ret = (avg >= 70)? "success" : "failed" ;
		int OK = (avg >= 70)? 1 : 0 ;
		char cw = (avg >= 70)? 'O' : 'X' ;
		
		System.out.print("���� = " + tot + "\n"); //print( )�޼ҵ�� enter��� 
		System.out.print("��� = " + avg + "\n");
		System.out.print("��� = " + message + "\n");
		System.out.println(); //enter ���
		//���� System.out.print(���뵥���ͱ��);
		System.out.print("��� = " + ret + "\t"); //print( )�޼ҵ�� enter��� 
		System.out.print("��� = " + OK + "\t");
		System.out.print("��� = " + cw + "\t");
	}

}//Three class END
