package self;

public class sf2 {//166p 7��

	public static void main(String[] args) {
		int [] a = new int[10]; double sum=0.0;
		System.out.print("������ ������ : ");
		for(int i=0; i<10; i++) {
			int num = (int)(Math.random()*10+1);
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println();
		System.out.println("����� " + sum/10);
	}
}
