package self;

import java.util.Scanner;

public class sf3 {//166p 7번

	public static void main(String[] args) {//8번
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?(1~100) ");
		int cnt=sc.nextInt();
		if (cnt>100) {
			System.out.println("1~100사이의 정수를 입력해 주세요.");
		}
		else if (cnt<0) {
			System.out.println("1~100사이의 정수를 입력해 주세요.");
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
