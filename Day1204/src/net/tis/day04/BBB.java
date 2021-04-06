package net.tis.day04;

public class BBB{ 
   public void display() {
	 System.out.println("리턴X display(X) ");
   }//end
   
   public void display(String a, int b, double c) {
	 System.out.println(a+" ");
	 System.out.println(b+" ");
	 System.out.println(c);
   }//end
     
   public void display(String a, int b, double c, String x, int y, double z) {
	 System.out.print(a+" "+b+" "+c+" ");
	 System.out.print(x+" "+y+" "+z);
   }//end
   
   public void display(String data, int year, double mypoint, String x, int y, double z, String s1, int s2, double s3) {
	 System.out.print(data+" "+year+" "+mypoint+" ");
	 System.out.print(x+" "+y+" "+z+" ");
	 System.out.print(s1+" ");
	 System.out.print(s2+" ");
	 System.out.print(s3);
   }//end
   
   public void display(String msg) {
	   System.out.println("글쓴이저자 " + msg);
   }
}//BBB class END



