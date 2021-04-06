package net.tis.day23;

import java.util.Scanner;
import java.lang.Math;

public class Game { //372페이지 코드 기술
	public static void main(String[] args) {
		System.out.println("5회안에 숫자 맞추기 게임");
		System.out.println("1부터 100사이의 숫자를 입력해주세요");
		int com = (int)(Math.random()*100)+1;
		//System.out.println("com난수 = " + com);
		int i =0, my=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
			i=i+1;
			System.out.print(i+"회 숫자입력>> ");
			my = Integer.parseInt(sc.nextLine());
			if(my == com) {
				System.out.println("\n 축하합니다. 정답입니다!"); break;
				}
			if(my<=0 || my > 100) {
				System.out.println("숫자범위는 1~100사이의 숫자여야 합니다."); i=i-1; continue;
				}
			/////여러분의 코드를 기술
			if(i==5) {System.out.println("\n5회를 초과했습니다 \n다음 기회에 이용하세요"); break;}
			if(my>com) {
				System.out.println(my + "보다 작은 수 입니다.");
				} else if(my<com) {
				System.out.println(my+"보다 큰 수 입니다.");
				}			
			//else {System.out.println("틀렸습니다.");}
				}catch (Exception e) {
				 System.out.println("제대로된 숫자를 입력해주세요"); i=i-1;
				}
			
			}//for end
		sc.close();	
	}//main end
}//class END
