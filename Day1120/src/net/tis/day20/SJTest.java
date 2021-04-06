package net.tis.day20;

public class SJTest{

	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0 ;
		double avg=0.0 ; //평균
		String message = "합격재시험메세지" ;
		kor = 70 ;
		eng = 60 ;
		//총점, 평균 구해서 출력
		tot = kor + eng ;
		avg = (double)tot / 2 ;
		
		if (avg >= 70)
			message = "축합격" ;
		else
			message = "재시험" ;
		
		//97페이지 다중 if ~ else if ~ else
		//90~100 grade='A' 80~89 grade='B'
		//70~79 grade='C' 60~69 grade='D' 0~59 grade='F'
		//98페이지 참고하면서
		
		String ret = (avg >= 70)? "success" : "failed" ;
		int OK = (avg >= 70)? 1 : 0 ;
		char cw = (avg >= 70)? 'O' : 'X' ;
		
		System.out.print("총점 = " + tot + "\n"); //print( )메소드는 enter기능 
		System.out.print("평균 = " + avg + "\n");
		System.out.print("결과 = " + message + "\n");
		System.out.println(); //enter 기능
		//에러 System.out.print(내용데이터기술);
		System.out.print("결과 = " + ret + "\t"); //print( )메소드는 enter기능 
		System.out.print("결과 = " + OK + "\t");
		System.out.print("결과 = " + cw + "\t");
	}

}//Three class END
