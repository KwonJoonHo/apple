package net.tis.day20;
//156������ ����ó�� �ǽ�
import java.util.Scanner;
import java.util.InputMismatchException;
public class InputException1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("���� 3���� �Է��ϼ���");
		int sum=0, n=0;
		for(int i =0; i<3; i++) {
			System.out.print(i+ ">>");
			try { n= scanner.nextInt(); //�����Է�
			}catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scanner.nextLine(); //���� �Է� ��Ʈ���� �����ִ� ��ū�� �����.
				i--; //�ε����� �������� �ʵ��� �̸� ����
				continue;//���� ����
			}
			sum+=n;//���ϱ�				
			}//for end
		System.out.println("���� " + sum);
		scanner.close();
		
		
		double avg = 78.9;
		int a = (int)avg ;
		
		String data = "1200"; //String Ŭ���� 
		//����int b = (int)data;
		int b = Integer.parseInt(data);
		System.out.println(data + 98);
		System.out.println(b+98);
	}//for end
}//main end
//class END
