package net.tis.day02;

import java.util.Scanner;

public class Gabb {
	public static void main(String[] args) {
		int com=0,my=0,cnt=0,win=0,mu=0,lose=0,total=0,Gtotal=0;
		String msg="안내", my_msg="", com_msg="";
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		int sel=0;
		
		while(flag) {
			try {
			com = (int)(Math.random()*3)+1 ;
			System.out.println("com컴난수= " + com); //주석처리예정			
			System.out.println("승 : " + win + ", 무 : " + mu + ", 패 : " + lose + ", 총 횟수 : " + cnt + " 입니다." );
			System.out.print("1.가위 2.바위 3.보자기 9.종료 번호입력 >>> ");			
			sel = Integer.parseInt(sc.nextLine());
			if(sel==9) {
				System.out.println("\n가위바위보 게임을 종료합니다.");
				System.exit(1);
				flag=false;
				break;
			}
			switch(sel) {
			case 1 : 
				if(com==1) {
					mu =mu+1; cnt = cnt+1;
					my_msg="가위"; com_msg="가위";
					System.out.println("나의 선택은 : " + my_msg + "\t컴의 선택은 : " + com_msg);
					System.out.println("제 " + cnt + "회전 결과는 비겼습니다."); break;
				}
				else if(com==2) {
					lose =lose+1; cnt = cnt+1;
					my_msg="가위"; com_msg="바위";
					System.out.println("나의 선택은 : " + my_msg + "\t컴의 선택은 : " + com_msg);
					System.out.println("제 " + cnt + "회전 결과는 졌습니다."); break;
				}
				else if(com==3) {
					win =win+1; cnt = cnt+1;
					my_msg="가위"; com_msg="보";
					System.out.println("나의 선택은 : " + my_msg + "\t컴의 선택은 : " + com_msg);
					System.out.println("제 " + cnt + "회전 결과는 이겼습니다."); break;
				}
			case 2 : 
				if(com==2) {
					mu =mu+1; cnt = cnt+1;
					my_msg="바위"; com_msg="바위";
					System.out.println("나의 선택은 : " + my_msg + "\t컴의 선택은 : " + com_msg);
					System.out.println("제 " + cnt + "회전 결과는 비겼습니다."); break;
				}
				else if(com==3) {
					lose =lose+1; cnt = cnt+1;
					my_msg="바위"; com_msg="보";
					System.out.println("나의 선택은 : " + my_msg + "\t컴의 선택은 : " + com_msg);
					System.out.println("제 " + cnt + "회전 결과는 졌습니다."); break;
				}
				else if(com==1) {
					win =win+1; cnt = cnt+1;
					my_msg="바위"; com_msg="가위";
					System.out.println("나의 선택은 : " + my_msg + "\t컴의 선택은 : " + com_msg);
					System.out.println("제 " + cnt + "회전 결과는 이겼습니다."); break;
				}
			case 3 : 
				if(com==3) {
					mu =mu+1; cnt = cnt+1;
					my_msg="보"; com_msg="보";
					System.out.println("나의 선택은 : " + my_msg + "\t컴의 선택은 : " + com_msg);
					System.out.println("제 " + cnt + "회전 결과는 비겼습니다."); break;
				}
				else if(com==1) {
					lose =lose+1; cnt = cnt+1; 
					my_msg="보"; com_msg="가위";
					System.out.println("나의 선택은 : " + my_msg + "\t컴의 선택은 : " + com_msg);
					System.out.println("제 " + cnt + "회전 결과는 졌습니다."); break;
				}
				else if(com==2) {
					win =win+1; cnt = cnt+1;
					my_msg="보"; com_msg="바위";
					System.out.println("나의 선택은 : " + my_msg + "\t컴의 선택은 : " + com_msg);
					System.out.println("제 " + cnt + "회전 결과는 이겼습니다."); break;
				}
			default : System.out.println("1~3중 하나를 입력해 주세요."); break;
			}
			} catch (Exception e) {System.out.println("숫자를 입력해 주세요.");}
		}//while end		
		
		sc.close();
	}//main end
}//Gabb class END
