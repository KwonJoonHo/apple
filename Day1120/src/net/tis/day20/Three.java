package net.tis.day20;
//return �ܵ����� Ż��
public class Three {
	public static void main(String[] args) {
		int[] data = lotto();
		for(int su:data) {
			System.out.print(su + " ");
		}System.out.println();
		
		String like = book();
		System.out.println("�����ִ� å���� = " + like);
		
		System.out.println();
		System.out.println("�츮����");
		System.out.println("�ݼ�����");
		System.out.println("ȭ������");
		
		//return ; ���⿡ ����ϸ� ��������		
		System.out.println("���������� 10:37");
		System.out.println("��������� 10:37");
		return ; //�Ǹ������� return�� ����ϸ� �ǹ̾���
	}//end
	
	public static int[] lotto() {
		int [] su = { 23, 9, 45, 29, 33, 16};
		//return �����Ͱ� su ����ϸ� �޼ҵ� lotto() ���
		return su;} 
		
		public static String book() {
			String title="�����";
			return title ;		
	}//end
}//class END
