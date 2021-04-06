package self;

import java.util.Scanner;
public class one2 {
	public static void main(String[] args) {
		int num=0,n=0; String a = "abcdefghijklmnopqrstuvwxyz";		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력해 주세요 >> ");
		String s = sc.next();
		char c = s.charAt(0);			
		n=(a.indexOf(c)+1);
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(a.substring(j,j+1));
			}
			System.out.println("");
		}
	}
}
