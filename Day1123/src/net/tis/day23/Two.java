package net.tis.day23;

public class Two {

	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0 ;
		double avg=0.0 ; //평균
		String message = "" ;
		kor = 95 ;
		eng = 41 ;
		//총점, 평균 구해서 출력
		tot = kor + eng ;
		avg = (double)tot / 2 ;
		//합격여부는 과목별 60점부터 평균 70점부터 축합격 /else 재시험
		if (avg >= 70 || kor>=60 || eng>=60) {message = "축합격" ;}
				else message = "재시험" ;
			
		
		System.out.println("국어 = " + kor);
		System.out.println("영어 = " + eng);
		System.out.print("총점 = " + tot + "\n"); //print( )메소드는 enter기능 
		System.out.print("평균 = " + avg + "\n");
		System.out.print("결과 = " + message + "\n");
		System.out.println(); //enter 기능
	}

}//Three class END
