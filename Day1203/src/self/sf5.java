package self;

import java.util.Scanner;

public class sf5 {//14�� �ϴٰ� ����
	public static void main(String[] args) {//14��
		Scanner sc = new Scanner(System.in);
		String name; int i=0;
		String course [] = { "java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score [] = {95, 88, 76, 62, 55};
		
		while(true) {
			System.out.print("�����̸�>> ");
			name = sc.nextLine();
			for(i=0; i<course.length; i++) {
				if(name=="�׸�") { break;					
				}					
				
				else if(course[i].equals(name)) {//������� course[i]�� ���ڿ��� �������
					int n = score[i];
					System.out.println(name+"�� ������ "+score[i]); continue;
				}
				else {System.out.println("���� �����Դϴ�."); continue;}		
			}
		}		
	}
}
