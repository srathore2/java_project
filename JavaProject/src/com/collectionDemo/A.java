package com.collectionDemo;




public class A {
class Container {
int length;
int count;
public Container() {
length = 1;
}
public int getLength() {
return length;
}
public void setLength(int length) {
this.length = length;
}
public int getCount() {
return count;
}
public void setCount(int count) {
this.count = count;
}
}
void modifyContainerLength(Container t) {
t.setLength(4);
}
void modifyContainerCount(int i) {
i = 5;
}
void setup() {
Container container = new Container();
container.setLength(2);
modifyContainerLength(container);
int count = 3;
modifyContainerCount(count);
System.out.print(container.getLength());
System.out.print(" ");
System.out.print(count);
}
public static void main(String[] args) {
A c = new A();
c.setup();
}
}
