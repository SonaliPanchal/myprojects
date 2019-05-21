package com.nt.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {//Because object value can convert bit and byte and sent through n/w

	private int sno;//so no one  can change variable value name directly only through the getter setter we can change value of the variable
	private String sname;
	private float m1;
	private float m2;
	private float m3;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getM1() {
		return m1;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public float getM3() {
		return m3;
	}
	public void setM3(float m3) {
		this.m3 = m3;
	}
	
	
}
