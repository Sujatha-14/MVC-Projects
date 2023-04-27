package mvc;

public class Controller {
	private Model m;
	private View v;
	
public Controller(Model m,View v) {
	this.m=m;
	this.v=v;
}
public void setModelName(String name) {
	m.setName(name);
}
public String getModelName() {
	return m.getName();
}
public void setRollNum(int rollNum) {
	m.setRollNum(rollNum);
}
public int getRollNum() {
	return m.getRollNum();
}
public void seeDetails() {
	v.viewDetail(m.getName(),m.getRollNum() );
}
}
