package net.tis.day20;
//139������ �� ������ 2�����迭 �ʱ�ȭ
public class ScoreAverage01 {
	public static void main(String[] args) {
		int intArray [][] = {{0,1,2}, {3,4,5}, {6,7,8} } ;
		char charArray [][] = {{'a', 'b', 'c'}, {'d', 'e', 'f'} } ;
		double doubleArray [][] = { {0.01, 0.02}, {0.03, 0.04} } ;
		
		//140������ 2���� �迭
		double[][] score = {
				{3.3, 3.4}, //0��°��	
				{3.5, 3.6, 4.7, 5.2, 6.3}, //1��°��
				{3.7, 4.0},	//2��°��
				{4.1, 4.2}  //3��°��
		};
		//System.out.println("�迭������ " + score.length);
		//System.out.println("�迭���ο� " + score[1].length);
		//������ 4��, ���ο� 2��
		//���ι迭�̸�.length   ���� �迭�� [��].length 
		for(int a=0; a<score.length; a++) {
			for(int term=0; term<score[a].length; term++) {
				System.out.print(score[a][term] + " ");
			}//term end
			System.out.println();//������� ���ΰ����ϸ� ���� ������ ¯
		}//a end

	}//end
}//class END
