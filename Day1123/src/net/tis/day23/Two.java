package net.tis.day23;

public class Two {

	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0 ;
		double avg=0.0 ; //���
		String message = "" ;
		kor = 95 ;
		eng = 41 ;
		//����, ��� ���ؼ� ���
		tot = kor + eng ;
		avg = (double)tot / 2 ;
		//�հݿ��δ� ���� 60������ ��� 70������ ���հ� /else �����
		if (avg >= 70 || kor>=60 || eng>=60) {message = "���հ�" ;}
				else message = "�����" ;
			
		
		System.out.println("���� = " + kor);
		System.out.println("���� = " + eng);
		System.out.print("���� = " + tot + "\n"); //print( )�޼ҵ�� enter��� 
		System.out.print("��� = " + avg + "\n");
		System.out.print("��� = " + message + "\n");
		System.out.println(); //enter ���
	}

}//Three class END
