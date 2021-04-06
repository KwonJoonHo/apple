package net.tis.day20;
//139페이지 맨 마지막 2차원배열 초기화
public class ScoreAverage01 {
	public static void main(String[] args) {
		int intArray [][] = {{0,1,2}, {3,4,5}, {6,7,8} } ;
		char charArray [][] = {{'a', 'b', 'c'}, {'d', 'e', 'f'} } ;
		double doubleArray [][] = { {0.01, 0.02}, {0.03, 0.04} } ;
		
		//140페이지 2차원 배열
		double[][] score = {
				{3.3, 3.4}, //0번째행	
				{3.5, 3.6, 4.7, 5.2, 6.3}, //1번째행
				{3.7, 4.0},	//2번째행
				{4.1, 4.2}  //3번째행
		};
		//System.out.println("배열가로행 " + score.length);
		//System.out.println("배열세로열 " + score[1].length);
		//가로행 4행, 세로열 2열
		//가로배열이름.length   세로 배열행 [행].length 
		for(int a=0; a<score.length; a++) {
			for(int term=0; term<score[a].length; term++) {
				System.out.print(score[a][term] + " ");
			}//term end
			System.out.println();//행단위로 라인개행하면 좋죠 가독성 짱
		}//a end

	}//end
}//class END
