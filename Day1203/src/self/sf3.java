package self;

import java.util.Scanner;

public class sf3 {//166p 7��

	public static void main(String[] args) {//8��
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �?(1~100) ");
		int cnt=sc.nextInt();
		if (cnt>100) {
			System.out.println("1~100������ ������ �Է��� �ּ���.");
		}
		else if (cnt<0) {
			System.out.println("1~100������ ������ �Է��� �ּ���.");
		}
		else {
			int [] a = new int [cnt];
			for(i=0; i<cnt; i++) {				
				a[i] = (int)(Math.random()*100+1);
				for(int b=0; b<i; b++) {
					if (a[i]==a[b]) { i--; break;}				
				}		
			}
			for(i=0; i<cnt; i++) {
				System.out.print(a[i] + " ");	
			}
		} sc.close();
	}	
}
