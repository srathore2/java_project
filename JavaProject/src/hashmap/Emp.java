package hashmap;

import com.collectionDemo.Address;

public class Emp {
int id;
String name;
String sname;

public Emp(int id, String name, String sname) {
	super();
	this.id = id;
	this.name = name;
	this.sname = sname;
	
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

@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", sname=" + sname + "]";
}



}
