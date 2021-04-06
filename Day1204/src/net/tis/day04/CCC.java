package net.tis.day04;

public class CCC{  
	String name;
	int age;
	double point;
	
	//오.버=>source=>Generate Getters and Setters...select All
	public String getName() {return name;}
	public void setName(String name) {this.name = name;	}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public double getPoint() {return point;}
	public void setPoint(double point) {this.point = point;}

	public String toString() {
		//정답 String msg=getName()+" "+getAge()+" "+getPoint();
		String msg=this.name+" "+this.age+" "+this.point;
		return msg;
	}//end	
}//CCC class END














