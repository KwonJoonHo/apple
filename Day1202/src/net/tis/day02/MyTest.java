package net.tis.day02;

public class MyTest {
	public static void main(String[] args) {
		System.out.println("MyTest�ڹٹ��� 2:49 3:31");
		int[] arr = new int [6];		
		for(int a=0; a<arr.length; a++) {//��¸�
			arr[a] = (int)(Math.random()*10+1);
			for(int b=0; b<a; b++) {
				if (arr[a]==arr[b]) { a--; break;}				
			}						
		}
		for(int a=0; a<arr.length; a++) {
			System.out.print(arr[a]+" ");
			//ù��° �߻��� �ߺ�üũ X
			//2���߻����� �ߺ�üũ for(){�����߻�for(){if ����=�ι�°}
		}

		//����
	}	
}


