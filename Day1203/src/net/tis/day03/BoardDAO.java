package net.tis.day03;

import java.util.ArrayList;

public class BoardDAO {
   public BoardDAO( ) { }
   public void boardDisplay(ArrayList<BoardDTO> dto) {
	   //for�ݺ��� �������� ��� 
	   for(int i=0; i<dto.size(); i++) {
		   BoardDTO bt = (BoardDTO)dto.get(i);
		   System.out.print(bt.getWriter() + " ");
		   System.out.print(bt.getWdate() + " ");
		   System.out.print(bt.getPoint() + " ");
		   System.out.println(bt.getCnt());
	   }
   }//end
	
}//class END
