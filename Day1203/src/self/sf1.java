package self;

import java.util.Scanner;

public class sf1 {
	public static void main(String[] args) {
		int [] a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}		
		System.out.print("3�� ����� ");
		for(int j=0; j<a.length; j++) {
			if((a[j]%3)==0) {
				System.out.print(a[j]+ " ");
			}
			else { } 
		}
		sc.close();	
	}
}
