package net.tis.day23;

public class First {

	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0 ;
		double avg=0.0 ; //���		
		kor = 95 ;
		eng = 50 ;
		//����, ��� ���ؼ� ���
		tot = kor + eng ;
		avg = (double)tot / 2 ;
		//�հݿ��δ� ���� 60������ ��� 70������ ���հ� /else �����
//		if (avg >= 70) {
//			if(kor>=60 && eng>=60) {
//				message = "���հ�" ;}
//				else message = "�����" ;
//			
//		}		
//		else
//			message = "�����" ;
		String ok = (avg>=70)? "pass" : "failed" ; 
		System.out.println("���� = " + kor);
		System.out.println("���� = " + eng);
		System.out.print("���� = " + tot + "\n"); //print( )�޼ҵ�� enter��� 
		System.out.print("��� = " + avg + "\n");
		System.out.print("��� = " + ok + "\n");
		System.out.println(); //enter ���
	}

}//Three class END
