package self;

import java.util.Scanner;

public class sf1 {
	public static void main(String[] args) {
		int [] a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}		
		System.out.print("3의 배수는 ");
		for(int j=0; j<a.length; j++) {
			if((a[j]%3)==0) {
				System.out.print(a[j]+ " ");
			}
			else { } 
		}
		sc.close();	
	}
}
