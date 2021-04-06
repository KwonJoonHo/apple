package net.tis.day03;

public class GuestDTO { //DTO=캐리어=data transfer object,단독실행안됨
	private String name;
	private int age;
	private double point;
	//오.버=>source =>Generate getters and setters...
	
	public String getName() {return name;	}
	public void setName(String name) {this.name = name;	}
	public int getAge() {return age;	}
	public void setAge(int age) {this.age = age;}
	public double getPoint() {	return point;	}
	public void setPoint(double point) {this.point = point;	}
	
}//GuestDTO class END
