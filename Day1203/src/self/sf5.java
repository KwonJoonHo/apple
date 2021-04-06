package self;

import java.util.Scanner;

public class sf5 {//14번 하다가 멈춤
	public static void main(String[] args) {//14번
		Scanner sc = new Scanner(System.in);
		String name; int i=0;
		String course [] = { "java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score [] = {95, 88, 76, 62, 55};
		
		while(true) {
			System.out.print("과목이름>> ");
			name = sc.nextLine();
			for(i=0; i<course.length; i++) {
				if(name=="그만") { break;					
				}					
				
				else if(course[i].equals(name)) {//과목명이 course[i]의 문자열과 같은경우
					int n = score[i];
					System.out.println(name+"의 점수는 "+score[i]); continue;
				}
				else {System.out.println("없는 과목입니다."); continue;}		
			}
		}		
	}
}
