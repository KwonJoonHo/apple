package net.tis.day04;

public abstract class Mother { //�߻�Ŭ���� 
	public static String cook() { //static�޼ҵ�
	  System.out.println("Mother static String cook");
	  String kind="������ġ�� ����";
	  return kind;
	}//static�޼ҵ� cook
	
	public void cal(int m) { //Non-static�޼ҵ�
	   System.out.println("Mother void cal(int)");	
	}//non-static�޼ҵ� cal
	
	//�߻�޼ҵ�=abstract�޼ҵ�� ���� { }����
	//�޼ҵ� abstractŰ���� �߰�
	//�߻�޼ҵ尡 ������ �ڵ� �߻�Ŭ���� abstract class 
	//�߻�Ŭ������ interface�� newŰ���� ���Ұ�, 
	public abstract double  study() ; //�߻�޼ҵ� 
}//Mother class END








