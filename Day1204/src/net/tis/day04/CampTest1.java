package net.tis.day04;
import java.util.Scanner;
public class CampTest1 {
	public static void main(String[] args) {
		System.out.println("1�����迭 ķ������");
		Scanner sc = new Scanner(System.in);
		char[] camp = new char[5]; //0��° 1��° 2��° 3��° 4��°
		int sel=9, num=0;
		
		//ķ���� �������Ȯ��
		for(int i=0; i<camp.length; i++) {
			if(camp[i]=='a') {
				System.out.println(" " +(i+1) + "��° ��ķ�� ������Դϴ�.");
			}else {
				System.out.println(" " + (i+1) + "��° ��ķ������ ����ֽ��ϴ�.");
			}
		}//for end
		
		while(true) {
			try {
				System.out.print("\n1.���� 2.��� 3.���� 9.���� :");
				sel = Integer.parseInt(sc.nextLine());
				if(sel==9) {
					System.out.println("ķ���� �������α׷��� �����մϴ�.");
					break;
				}
				
			switch(sel) {
				case 1:
					System.out.print("����ķ�ι�ȣ �Է�>>> ");
					num=Integer.parseInt(sc.nextLine());//������ 5�Է�
					if(num<1||num>5) {System.out.println(num+"��ȣ�� ����� �� �����ϴ�.");}
					if(camp[num-1]=='a') {
						System.out.println("�̹� ����� ķ���� ����� �� �����ϴ�.");
					}else {
						System.out.println("camp["+num+"]ķ���� ���༺��");
						camp[num-1]='a'; // false��� ��¥ true�� ����
					}
					
					for(int i=0; i<camp.length; i++) {
						if(camp[i]=='a') {
							System.out.println(" "+(i+1)+"��° ��ķ�� ������Դϴ�.");
						}else {
							System.out.println(" "+(i+1)+"��° ��ķ������ ����ֽ��ϴ�.");
						}
					}//for end
				break;
				case 2: //����� ����/���κ� ó��
					System.out.print("���ķ�ι�ȣ �Է�>>> ");
					num=Integer.parseInt(sc.nextLine()); //3�Է��ϸ�
					if(camp[num-1]=='a') {
						System.out.println("camp["+num+"] ķ���� ��Ǽ����߽��ϴ�.");
						camp[num-1]='b';
					}else {
						System.out.println("camp["+num+"] ����ִ� ķ�����Դϴ�.");
					}
					
					for(int i=0; i<camp.length; i++) {
						if(camp[i]=='a') {
							System.out.println(" "+(i+1)+"��° ��ķ�� ������Դϴ�.");
						}else {
							System.out.println(" "+(i+1)+"��° ��ķ������ ����ֽ��ϴ�.");
						}
					}//for end
				break;
				case 3: //��ü�������
				for(int i=0; i<camp.length; i++) {
					if(camp[i]=='a') {
						System.out.println(" "+(i+1)+"��° ��ķ�� ������Դϴ�.");
					}else {
						System.out.println(" "+(i+1)+"��° ��ķ������ ����ֽ��ϴ�.");
					}
				}//for end
				break;
				default:
				System.out.println("1~3�޴��� �����ϼž� �մϴ�");
				break;
				}//switch end
			}catch (Exception e) { }						
		}//while
		sc.close();
	}//end
}//class END