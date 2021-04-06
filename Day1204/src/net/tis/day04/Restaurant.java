package net.tis.day04;

import java.text.DecimalFormat;

public class Restaurant {
	public static void main(String[] args) {
		Menu pizza = new Menu("ġ�����", 4600) ;     
		Menu steak = new Menu("T��������ũ",  10500) ; 
	
		Menu[ ] member = { pizza, steak, new Menu("����Ʈ�ݶ�", 2000) } ;
        Order der = new Order(1200, member);
        DecimalFormat df = new DecimalFormat("##,###");
        System.out.println("\n���ֹ��ݾ� " +  df.format(der.getTotal()) +"��");
	}//main end
}//Restaurant class END=========================================================

class Order {
	public int tot;
	public int seq;
	public Menu[ ] menus;
	
	public Order( ) { }
	public Order(int seq, Menu[ ] menus) { 
		this.seq = seq;
		this.menus = menus;
	}//end
	
	public int getTotal( ) {
	  DecimalFormat df=new DecimalFormat("##,###");
	  for( int i=0; i<menus.length; i++) {
		this.tot = this.tot +  menus[i].price; 
	  }
	  return tot;	
	}//end
}//Order class END===========================================================

class Menu{
   public String kind;
   public int price; 
   
   public Menu( ) { } 
   public Menu( String kind, int price) {
	   this.kind = kind;
	   this.price = price;
	   
	   DecimalFormat df=new DecimalFormat("##,###");
	   //System.out.printf("%s�޴�\t  %8d��\n", this.kind, this.price);
	   System.out.println(this.kind + "�޴�\t " + df.format(this.price)+"��");
   }//end
}//Menu class END===========================================================







