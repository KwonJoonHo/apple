package net.tis.day01;

public class TestJumin6 {
	public static void main(String[] args) {
		String jumin="891214-1793485";		
		System.out.println(jumin.substring(0,6)+("-1******"));
		
		String msg="���ӽ�,����,����,,�浿,���ٸ�";
		//split�޼ҵ� �̿��ؼ� ,  �����ϼ���
		String [] data = msg.split(",");
		for(int i=0; i<data.length ; i++) {
			System.out.print(data[i]+ " ");}
		
		System.out.println();
		//135������ for~each ���� �ݺ������� ���
		for(String temp : data) {
			System.out.print(temp + " ");
		}
		
		
	}//main end
}
