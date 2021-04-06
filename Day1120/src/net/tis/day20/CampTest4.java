package net.tis.day20;
import java.util.Scanner;
public class CampTest4 {
	public static void main(String[] args) {
		System.out.println("1차원배열 캠프예매 20일 금요일 5:37");
		Scanner sc = new Scanner(System.in);
		//boolean[] camp = new boolean[5]; //0번째 1번째 2번째 3번째 4번째
		int [] camp = new int[5]; //0번째 1번째 2번째 3번째 4번째
		int sel=9, num=0;
		
		//캠핑장 예약상태확인
		for(int i=0; i<camp.length; i++) {
			if(camp[i]==1) {
				System.out.println(" " +(i+1) + "번째 ■캠프 사용중입니다.");
			}else {
				System.out.println(" " + (i+1) + "번째 □캠프장은 비어있습니다.");
			}
		}//for end
		
		while(true) {
			try {
				System.out.print("\n1.예약 2.퇴실 3.보기 9.종료 :");
				sel = Integer.parseInt(sc.nextLine());
				if(sel==9) {
					System.out.println("캠프장 예약프로그램을 종료합니다.");
					break;
				}
				
				if (sel==1) {
					System.out.print("예약캠핑번호 입력>>> ");
					num=Integer.parseInt(sc.nextLine());//고객이 5입력
					if(num<1||num>5) {System.out.println(num+"번호를 사용할 수 없습니다.");}
					if(camp[num-1]==1) {
						System.out.println("이미 예약된 캠프장 사용할 수 없습니다.");
					}else {
						System.out.println("camp["+num+"]캠프장 예약성공");
						camp[num-1]=1; // false대신 진짜 true값 대입
					}
					
					for(int i=0; i<camp.length; i++) {
						if(camp[i]==1) {
							System.out.println(" "+(i+1)+"번째 ■캠프 사용중입니다.");
						}else {
							System.out.println(" "+(i+1)+"번째 □캠프장은 비어있습니다.");
						}
					}//for end	
				}
				else if (sel==2) { //퇴실은 조별/개인별 처리
					System.out.print("퇴실캠핑번호 입력>>> ");
					num=Integer.parseInt(sc.nextLine()); //3입력하면
					if(camp[num-1]==1) {
						System.out.println("camp["+num+"] 캠프장 퇴실성공했습니다.");
						camp[num-1]=0;
					}else {
						System.out.println("camp["+num+"] 비어있는 캠프장입니다.");
					}
					
					for(int i=0; i<camp.length; i++) {
						if(camp[i]==1) {
							System.out.println(" "+(i+1)+"번째 ■캠프 사용중입니다.");
						}else {
							System.out.println(" "+(i+1)+"번째 □캠프장은 비어있습니다.");
						}
					}//for end
				}
				else if (sel==3) { //전체예약상태
				for(int i=0; i<camp.length; i++) {
					if(camp[i]==1) {
						System.out.println(" "+(i+1)+"번째 ■캠프 사용중입니다.");
					}else {
						System.out.println(" "+(i+1)+"번째 □캠프장은 비어있습니다.");
					}
				}//for end
				}
				else {
				System.out.println("1~3메뉴를 선택하셔야 합니다");
				
				}//switch end
			}catch (Exception e) { }						
		}//while
		sc.close();
	}//end
}//class END
