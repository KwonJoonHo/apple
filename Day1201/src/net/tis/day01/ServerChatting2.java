package net.tis.day01;

import java.util.Vector;

public class ServerChatting2 {

	public static void main(String[] args) {
		Vector vt = new Vector();//배열아님
		String nick = new String("길동");
		Integer age = new Integer(27);
		Boolean gender = new Boolean(true);
		String city = new String("서울");
		
		//vt.add(nick); 정석
		//vt.add(new String("길동"));정석
		vt.add("길동"); //간편식 자동으로 new String("길동")변환됨
		//vt.add(age); 정석
		//vt.add(new Integer(27)); 정석
		vt.add(27); //간편식 자동으로 new Integer(27)변환됨		
	}//end
}//class END
