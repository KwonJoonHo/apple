package net.tis.day03;

public class GuestDTO { //DTO=ĳ����=data transfer object,�ܵ�����ȵ�
	private String name;
	private int age;
	private double point;
	//��.��=>source =>Generate getters and setters...
	
	public String getName() {return name;	}
	public void setName(String name) {this.name = name;	}
	public int getAge() {return age;	}
	public void setAge(int age) {this.age = age;}
	public double getPoint() {	return point;	}
	public void setPoint(double point) {this.point = point;	}
	
}//GuestDTO class END
