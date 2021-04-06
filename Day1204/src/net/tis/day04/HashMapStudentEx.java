package net.tis.day04;

import java.util.HashMap;
import java.util.Scanner;

class Student {
	private int id;
	private String tel;
	public Student(int id, String tel) {
		this.id=id;
		this.tel=tel;
	}//������ end
	public int getId( ) {return id;}
	public void setId(int id) {this.id=id;}
	public String getTel() { return tel; }
}//class END

public class HashMapStudentEx {
	public static void main(String[] args) {
		//(�л��̸�, Student��ü)�� �����ϴ� �ؽø� ����
		HashMap<String,Student> map = new HashMap<String,Student>(); 
		map.put("Ȳ����", new Student(1, "010-111-1111"));
		map.put("���繮", new Student(2, "010-222-2222"));
		map.put("�賲��", new Student(3, "010-333-3333"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸�? ");
			String name = sc.nextLine(); //����ڷκ��� �̸��Է�
			if(name.equals("exit"))
				break; //while���� ��� ���α׷� ����
			Student student = map.get(name);//�̸��� �ش��ϴ� Student ��ü �˻�
			if(student == null)
				System.out.println(name+"�� ���� ����Դϴ�.");
			else
				System.out.println("id: " + student.getId()+", ��ȭ: " + student.getTel());
		}
		sc.close();
	}//main end	
}//class END
