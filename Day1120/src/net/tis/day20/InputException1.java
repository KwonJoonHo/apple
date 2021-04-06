package net.tis.day20;
//156페이지 예외처리 실습
import java.util.Scanner;
import java.util.InputMismatchException;
public class InputException1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("정수 3개를 입력하세요");
		int sum=0, n=0;
		for(int i =0; i<3; i++) {
			System.out.print(i+ ">>");
			try { n= scanner.nextInt(); //정수입력
			}catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.nextLine(); //현재 입력 스트림에 남아있는 토큰을 지운다.
				i--; //인덱스가 증가하지 않도록 미리 감소
				continue;//다음 루프
			}
			sum+=n;//합하기				
			}//for end
		System.out.println("합은 " + sum);
		scanner.close();
		
		
		double avg = 78.9;
		int a = (int)avg ;
		
		String data = "1200"; //String 클래스 
		//에러int b = (int)data;
		int b = Integer.parseInt(data);
		System.out.println(data + 98);
		System.out.println(b+98);
	}//for end
}//main end
//class END
