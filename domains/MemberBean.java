package com.bitcamp.domains;

public class MemberBean {
	private String name, id, pw, ssn, blood;
	private double weight, height;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("회원정보 \n"
				+ "이름: %s \n"
				+ "id: %s \n"
				+ "비번: %s \n"
				+ "주민번호: %s \n"
				+ "혈액형: %s형 \n"
				+ "몸무게: %f \n"
				+ "키: %f \n"
				, name, id, pw, ssn, blood, weight, height);
	}
}
