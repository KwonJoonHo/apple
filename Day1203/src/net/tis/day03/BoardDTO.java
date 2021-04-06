package net.tis.day03;

import java.util.Date;

public class BoardDTO {
  public String writer;
  public int cnt;
  public Date wdate;
  public double point;
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public int getCnt() {
	return cnt;
}
public void setCnt(int cnt) {
	this.cnt = cnt;
}
public Date getWdate() {
	return wdate;
}
public void setWdate(Date wdate) {
	this.wdate = wdate;
}
public double getPoint() {
	return point;
}
public void setPoint(double point) {
	this.point = point;
}
  
}//class END
