package net.tis.day01;

public class TestLotto {
	public static void main(String[] args) {
		TestLotto tl=new TestLotto();
		//input메소드,output(int 배열)메소드호출
		int [] a = tl.input(); //6개 숫자데이터 발생해서 a한테 던졌어요
		tl.output(a); //6개숫자를 매개인자로 받아서 출력
	}//main end
	
	public int[] input(){//6개로또숫자를 발생 non-static일반메소드, 리턴값이 배열
		int[] arr = new int [6]; //배열은 자동으로 초기값 존재
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1); //372페이지 Math클래스 static double random(x)
		}
		return arr;
	}//end
	
	public void output(int[] data){//non-static일반메소드, 매개인자
		for(int tt : data) {
			System.out.print(tt+" ");
		}
		//for반복문 23,9,45,17,33,26 출력
	}//end
}//class END
