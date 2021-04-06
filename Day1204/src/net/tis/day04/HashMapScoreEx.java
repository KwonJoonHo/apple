package net.tis.day04;

import java.util.HashMap;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		//이름과 점수를 저장할 HashMap컬렉션 생성
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
			//var scoreMap = new HashMap<String, Integer>();로 간략히 써도 됨
		
		//5개의 점수 저장
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 :" + scoreMap.size());
		
		//모든 사람의 점수 출력. scoreMap에 들어 있는 모든 (key, value) 쌍 출력
		Set<String> keys = scoreMap.keySet(); //모든 key를 가진 Set컬렉션 리턴
				
		
	}

}
