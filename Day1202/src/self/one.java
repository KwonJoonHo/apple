package self;

import java.util.Scanner;
public class one {
	public static void main(String[] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 >> ");
		num=Integer.parseInt(sc.nextLine());
		
		for(int i=num; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
