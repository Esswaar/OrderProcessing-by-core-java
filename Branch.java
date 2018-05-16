package com.ver;

public class Branch implements Cloneable {
 String branch1;
 String branch2;
 String branch3;
public Branch(String branch1, String branch2, String branch3) {
	this.branch1 = branch1;
	this.branch2 = branch2;
	this.branch3 = branch3;
}

public String getBranch1() {
	return branch1;
}
public void setBranch1(String branch1) {
	this.branch1 = branch1;
}
public String getBranch2() {
	return branch2;
}
public void setBranch2(String branch2) {
	this.branch2 = branch2;
}
public String getBranch3() {
	return branch3;
}
public void setBranch3(String branch3) {
	this.branch3 = branch3;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

 
}
