package net.tis.day02;

public class First {
	public static void main(String[] args) {
		TestEmp emp = new TestEmp() ;
		emp.setName("�����");
		//���������� ����� ���		
		String data=emp.getName();
		System.out.println(data);
	}
}
