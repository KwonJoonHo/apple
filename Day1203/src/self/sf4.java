package self;

public class sf4 {
	public static void main(String[] args) {//13¹ø
		for(int i=0; i<99; i++) {
			int [] a = new int [99];
			a[i]=i+1;
			if(a[i]/10==3) {
				System.out.print(a[i] + "¹Ú¼ö Â¦");
				if((a[i]-(a[i]/10)*10)==3) {
					System.out.println("Â¦");
				}
				else if((a[i]-(a[i]/10)*10)==6) {
					System.out.println("Â¦");
				}
				else if((a[i]-(a[i]/10)*10)==9) {
					System.out.println("Â¦");
				}
				else {
					System.out.println("");
				}
			}
			else if(a[i]/10==6) {
				System.out.print(a[i]+"¹Ú¼ö Â¦");
				if((a[i]-(a[i]/10)*10)==3) {
					System.out.println("Â¦");
				}
				else if((a[i]-(a[i]/10)*10)==6) {
					System.out.println("Â¦");
				}
				else if((a[i]-(a[i]/10)*10)==9) {
					System.out.println("Â¦");
				}
				else {
					System.out.println("");
				}
		}
			else if(a[i]/10==9) {
				System.out.print(a[i]+"¹Ú¼ö Â¦");
				if((a[i]-(a[i]/10)*10)==3) {
					System.out.println("Â¦");
				}
				else if((a[i]-(a[i]/10)*10)==6) {
					System.out.println("Â¦");
				}
				else if((a[i]-(a[i]/10)*10)==9) {
					System.out.println("Â¦");
				}
				else {
					System.out.println("");
				}
			}
			else {
				if((a[i]-(a[i]/10)*10)==3) {
					System.out.println(a[i]+"¹Ú¼ö Â¦");
				}
				else if((a[i]-(a[i]/10)*10)==6) {
					System.out.println(a[i]+"¹Ú¼ö Â¦");
				}
				else if((a[i]-(a[i]/10)*10)==9) {
					System.out.println(a[i]+"¹Ú¼ö Â¦");
				}
			}
		}
	}
}
