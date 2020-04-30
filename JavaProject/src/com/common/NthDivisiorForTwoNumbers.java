package com.common;

public class NthDivisiorForTwoNumbers {
	
static	int gcd(int a, int b)
	{
	    if (b==0)
	        return a;
	    return gcd(b, a%b);
	}
static int findlcm(int arr[])
	{
	    // Initialize result
	    int ans = arr[0];
	 
	    // ans contains LCM of arr[0],..arr[i]
	    // after i'th iteration,
	    for (int i=1; i<arr.length; i++)
	        ans = ( ((arr[i]*ans)) /
	                (gcd(arr[i], ans)) );
	 
	    return ans;
	}
static void printBinary(int n){
	for(int i=1;i<=n;i++){
		System.out.println(Integer.toBinaryString(i));
	}
}
static int nthDivision(int a,int b,int n){
	int high,low,mid=0,cnt ,lcm;
	low=1;
	high=100;
	lcm=(a*b)/gcd(a,b);
	while(low<=high)
	{
        mid = (low + high) / 2;
        cnt = (mid / a) + (mid / b) - (mid / lcm);
        System.out.println("count:"+cnt+"   mid:"+mid);

        if(cnt < n)
            low = mid + 1;
        if(cnt > n)
            high = mid - 1;
        if(cnt == n)
            break;
    }
    //while((mid % a==0) && (mid % b==0))
       // mid--;
    return mid;
	
}
	public static void main(String[] args) {
		int a[]={3,4,9};
 //   System.out.println(findlcm(a));
		//printBinary(1000);
		//System.out.println("nth division:"+nthDivision(2, 3, 12));
		System.out.println(gcd(12,8));

	}

}
