package self;

public class sf4 {
	public static void main(String[] args) {//13��
		for(int i=0; i<99; i++) {
			int [] a = new int [99];
			a[i]=i+1;
			if(a[i]/10==3) {
				System.out.print(a[i] + "�ڼ� ¦");
				if((a[i]-(a[i]/10)*10)==3) {
					System.out.println("¦");
				}
				else if((a[i]-(a[i]/10)*10)==6) {
					System.out.println("¦");
				}
				else if((a[i]-(a[i]/10)*10)==9) {
					System.out.println("¦");
				}
				else {
					System.out.println("");
				}
			}
			else if(a[i]/10==6) {
				System.out.print(a[i]+"�ڼ� ¦");
				if((a[i]-(a[i]/10)*10)==3) {
					System.out.println("¦");
				}
				else if((a[i]-(a[i]/10)*10)==6) {
					System.out.println("¦");
				}
				else if((a[i]-(a[i]/10)*10)==9) {
					System.out.println("¦");
				}
				else {
					System.out.println("");
				}
		}
			else if(a[i]/10==9) {
				System.out.print(a[i]+"�ڼ� ¦");
				if((a[i]-(a[i]/10)*10)==3) {
					System.out.println("¦");
				}
				else if((a[i]-(a[i]/10)*10)==6) {
					System.out.println("¦");
				}
				else if((a[i]-(a[i]/10)*10)==9) {
					System.out.println("¦");
				}
				else {
					System.out.println("");
				}
			}
			else {
				if((a[i]-(a[i]/10)*10)==3) {
					System.out.println(a[i]+"�ڼ� ¦");
				}
				else if((a[i]-(a[i]/10)*10)==6) {
					System.out.println(a[i]+"�ڼ� ¦");
				}
				else if((a[i]-(a[i]/10)*10)==9) {
					System.out.println(a[i]+"�ڼ� ¦");
				}
			}
		}
	}
}
