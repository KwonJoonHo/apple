package net.tis.day04;

/*
Window�޴� �Ǹ����� => ����reference
Java => Editor => Save Actions
        üũ Perform the selected actions on save 
        => Organize importsüũ 
*/

public class Dunkin {	
		//int price = dk.coffee("��");
	public int coffee(String kind) {//103������
		int value = 0;
		switch(kind) {
		case "����������" : value=3500; break;
		case "īǪġ��" : value=3500; break;
		case "ī���" : value=3500; break;
		case "�Ƹ޸�ī��" : value=2000; break;
		case "�꽺" : value=4000; break;
		default : value=500; break;
		}
		return value;
	}//end
}//DunkinŬ����
