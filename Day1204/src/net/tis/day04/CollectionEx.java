package net.tis.day04;
import java.util.*;

public class CollectionEx {
	static void printList(LinkedList<String> l) { //����Ʈ�� ��Ҹ� ��� ����ϴ� �޼ҵ�
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if (iterator.hasNext())
				separator = "->"; //������ ��Ұ� �ƴϸ� ->���
			else
				separator = "\n"; //������ ����̸� �ٹٲ�
			System.out.println(e+separator);
		}
	}

	public static void main(String[] args) {
		
		
	}
}
