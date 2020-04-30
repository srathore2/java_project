package jdbcdemo;

public class Fibonici {
public int fibo(int n){
	if(n==0)
		return 0;
	else if(n==1)
		return 1;
	else
		return fibo(n-1)+fibo(n-2);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonici f=new Fibonici();
int a=-1;
int b=1;
int sum=0;
System.out.println("series");
for(int i=0;i<10;i++){
	sum=a+b;
	a=b;
	b=sum;
	System.out.println(sum);
}
System.out.println("recursin");
for(int x=0;x<5;x++){
	System.out.println(f.fibo(x));
}
	}

}
