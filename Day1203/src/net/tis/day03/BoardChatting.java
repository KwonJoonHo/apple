package net.tis.day03;

import java.util.ArrayList;
import java.util.Date;

public class BoardChatting {
	public static void main(String[] args) {
		ArrayList<BoardDTO> alist = new ArrayList<BoardDTO>();	
		
		int num=0;
		String[] a = {"서울", "대구", "대전", "부산"};
		int[] b = {02, 053, 042, 051};
		double[] c = {99.9, 54.5, 23.5, 0.02};
		Date[] d = { };
		
		while(true) {
			BoardDTO dto = new BoardDTO();
			dto.setWriter(a[num]);
			dto.setCnt(b[num]);
			dto.setPoint(c[num]);
			alist.add(dto);
			num++;
			if(num==4) break;			
			}//while end
		
		BoardDAO dao=new BoardDAO();
		dao.boardDisplay(alist);
	}//main end
}//class END
