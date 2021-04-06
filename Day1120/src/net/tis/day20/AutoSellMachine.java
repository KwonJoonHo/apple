package net.tis.day20;
import java.util.Scanner;
public class AutoSellMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel=9, money=1000;//기본값
		System.out.print("투입할 금액을 입력해주세요 >> ");
		money=Integer.parseInt(sc.nextLine());
		while(true) {
			
		try {
			System.out.println("자동판매기 입니다. (남은 금액 "+money+"원)");		
			System.out.println("1.콜라(500원) 2.유자차(150원) 3.커피(300원) 9.잔돈반환");	
			System.out.print("원하시는 음료를 골라주세요 >>");
			sel=Integer.parseInt(sc.nextLine());
			if(sel==9) {
				System.out.println("잔돈 " + money + "원이 반환됩니다.");
				break;}
			switch(sel) {
			case 1:
				money=money-500;
				System.out.println("콜라를 고르셨습니다.");
				System.out.println("남은 금액은 "+money+"원");
				break;
			case 2:
				money=money-150;
				System.out.println("유자차를 고르셨습니다.");
				System.out.println("남은 금액은 "+money+"원");
				break;
			case 3:
				money=money-300;
				System.out.println("커피를 고르셨습니다.");
				System.out.println("남은 금액은 "+money+"원");
				break;
			default:
				System.out.println("1~3메뉴를 선택하셔야 합니다.");
				break;
			}//switch end
		}catch (Exception e) { }
		
		}//while end
		
		sc.close();
	}//for end
}

