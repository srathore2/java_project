package com.tp.common;

public class Emp {
int id;
String name;
String sname;
Address add;
public Emp(int id, String name, String sname, Address add) {
	super();
	this.id = id;
	this.name = name;
	this.sname = sname;
	this.add = add;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", sname=" + sname + ", add="
			+ add + "]";
}



}
