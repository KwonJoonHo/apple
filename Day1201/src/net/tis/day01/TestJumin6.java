package net.tis.day01;

public class TestJumin6 {
	public static void main(String[] args) {
		String jumin="891214-1793485";		
		System.out.println(jumin.substring(0,6)+("-1******"));
		
		String msg="제임스,본드,고슬링,,길동,오바마";
		//split메소드 이용해서 ,  구분하세요
		String [] data = msg.split(",");
		for(int i=0; i<data.length ; i++) {
			System.out.print(data[i]+ " ");}
		
		System.out.println();
		//135페이지 for~each 향상된 반복문으로 출력
		for(String temp : data) {
			System.out.print(temp + " ");
		}
		
		
	}//main end
}
