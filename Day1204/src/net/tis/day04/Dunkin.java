package net.tis.day04;

/*
Window메뉴 맨마지막 => 참조reference
Java => Editor => Save Actions
        체크 Perform the selected actions on save 
        => Organize imports체크 
*/

public class Dunkin {	
		//int price = dk.coffee("라떼");
	public int coffee(String kind) {//103페이지
		int value = 0;
		switch(kind) {
		case "에스프레소" : value=3500; break;
		case "카푸치노" : value=3500; break;
		case "카페라떼" : value=3500; break;
		case "아메리카노" : value=2000; break;
		case "쥬스" : value=4000; break;
		default : value=500; break;
		}
		return value;
	}//end
}//Dunkin클래스
