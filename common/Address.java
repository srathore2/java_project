package com.tp.common;

public class Address {
int stno;
String stname;
String city;


public Address(int stno, String stname, String city) {
	super();
	this.stno = stno;
	this.stname = stname;
	this.city = city;
}


public int getStno() {
	return stno;
}


public void setStno(int stno) {
	this.stno = stno;
}


public String getStname() {
	return stname;
}


public void setStname(String stname) {
	this.stname = stname;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


@Override
public String toString() {
	return "Address [stno=" + stno + ", stname=" + stname + ", city=" + city
			+ "]";
}




}
