package net.tis.day01;

import java.util.Vector;

public class ServerChatting2 {

	public static void main(String[] args) {
		Vector vt = new Vector();//�迭�ƴ�
		String nick = new String("�浿");
		Integer age = new Integer(27);
		Boolean gender = new Boolean(true);
		String city = new String("����");
		
		//vt.add(nick); ����
		//vt.add(new String("�浿"));����
		vt.add("�浿"); //����� �ڵ����� new String("�浿")��ȯ��
		//vt.add(age); ����
		//vt.add(new Integer(27)); ����
		vt.add(27); //����� �ڵ����� new Integer(27)��ȯ��		
	}//end
}//class END
