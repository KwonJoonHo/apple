package self;

public class sf2 {//166p 7번

	public static void main(String[] args) {
		int [] a = new int[10]; double sum=0.0;
		System.out.print("랜덤한 정수들 : ");
		for(int i=0; i<10; i++) {
			int num = (int)(Math.random()*10+1);
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println();
		System.out.println("평균은 " + sum/10);
	}
}
