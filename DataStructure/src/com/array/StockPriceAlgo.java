package com.array;



public class StockPriceAlgo {

	private Integer buy;
	private Integer sell;
	
	
	void stockBuySell(int price[], int n){
		if(n==1){
			return;
		}
	int count=0;
	
	StockPriceAlgo[] stockobject=new StockPriceAlgo[n/2+1];
	for(int j=0;j<stockobject.length;j++){
		stockobject[j]=new StockPriceAlgo();
	}
	int i=0;
	while (i < n-1)
	{
		// Find Local Minima. Note that the limit is (n-2) as we are
		// comparing present element to the next element. 
		while ((i < n-1) && (price[i+1] <= price[i]))
			i++;

		// If we reached the end, break as no further solution possible
		if (i == n-1)
			break;
System.out.println("value of i "+i);
		// Store the index of minima
		//sol[count].buy = i++;
		stockobject[count].buy=i;
		i++;

		// Find Local Maxima. Note that the limit is (n-1) as we are
		// comparing to previous element
		while ((i < n) && (price[i] >= price[i-1]))
			i++;

		// Store the index of maxima
		stockobject[count].sell = i-1;

		// Increment count of buy/sell pairs
		count++;
	}
	if (count == 0)
       System.out.println("no day");
    else
    {
       for (int j = 0; j < count; j++)
        System.out.println("buy on day "+stockobject[j].buy+"  sell day"+stockobject[j].sell);
    }
 
    return;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		StockPriceAlgo s=new StockPriceAlgo();
		int array[]={100,180,260,310,40,535,695};
		s.stockBuySell(array, array.length);
	}

}

//time complexity o(n)
