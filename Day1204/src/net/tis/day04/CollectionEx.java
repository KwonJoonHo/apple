package net.tis.day04;
import java.util.*;

public class CollectionEx {
	static void printList(LinkedList<String> l) { //리스트의 요소를 모두 출력하는 메소드
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if (iterator.hasNext())
				separator = "->"; //마지막 요소가 아니면 ->출력
			else
				separator = "\n"; //마지막 요소이면 줄바꿈
			System.out.println(e+separator);
		}
	}

	public static void main(String[] args) {
		
		
	}
}
