package net.tis.day23;
import java.lang.Math;
public class MathEX { //372페이지 코드 기술
	public static void main(String[] args) {
		//372페이지 Math.random(), Random클래스 r = new Random();
		double a = 4.7;
		System.out.println(Math.PI); //원주율 상수 출력
		System.out.println(Math.ceil(a)); //ceil(올림)
		System.out.println(Math.floor(a)); //floor(내림)
		System.out.println(Math.sqrt(9)); //제곱근
		System.out.println(Math.exp(1)); //e의 2승
		System.out.println(Math.round(3.54)); //반올림
		
		// [1, 45] 사이의 정수형 난수 5개 발생
		System.out.println("이번주 행운의 번호는 ");
		double[] com = new double[6];
		for(int i=0; i<com.length; i++) {
			com[i] = Math.random()*45+1;
			System.out.println("난수=" + (int)com[i]);
			//문제 1~10사이 정수 6개 숫자
				}//for end
}
}
