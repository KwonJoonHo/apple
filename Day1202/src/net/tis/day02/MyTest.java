package net.tis.day02;

public class MyTest {
	public static void main(String[] args) {
		System.out.println("MyTest자바문서 2:49 3:31");
		int[] arr = new int [6];		
		for(int a=0; a<arr.length; a++) {//출력만
			arr[a] = (int)(Math.random()*10+1);
			for(int b=0; b<a; b++) {
				if (arr[a]==arr[b]) { a--; break;}				
			}						
		}
		for(int a=0; a<arr.length; a++) {
			System.out.print(arr[a]+" ");
			//첫번째 발생은 중복체크 X
			//2개발생부터 중복체크 for(){난수발생for(){if 먼저=두번째}
		}

		//권중
	}	
}


