package net.tis.day02;

public class TestEmp {
	public String name;//�������� =�ʵ� =field
	
	public static void main(String[] args) {
		//TestEmp.java���� ����ʵ�=�������� ����
		System.out.println("TestEmp 10:50");
		TestEmp te = new TestEmp() ;
		te.setName("��ġ");		
//		String a = te.getName();
//		System.out.println("�̸�=" + a);
		String data = te.getName();
		System.out.println("����������="+data);
//		te.setAge(27);
//		int b = te.getAge();
//		System.out.println("����=" + b);
	}//main end
	
	public void setName(String name) {
		//��±��� System.out.println("�Ѿ���̸�="+ss);
		//������������ �Ű����� �����ؿ�
		this.name = name; // ������������ ���������� Non-static�޼ҵ忡�� ��밡��
	}//end
	
	public String getName() {		
		//��±��� System.out.println("getName�޼ҵ� �̸�=" + name);
		//�������� �ʵ尪�� �޼ҵ� �̸����� ������ return �ʵ�
		//return �� Ÿ������ �޼ҵ尡 ���� ���
		return this.name;
	}
}//class END
