package program_8;

class StockMarketClass {
	public void maxProfit(int[] arr)
	{
//		  7 3 5 1 6 4
//		    i j
		int maxprofit=-1;
		for(int i=0; i<arr.length-1; i++)
		{
			int maxEle=arr[i];
			int j;
			for(j=i+1;j<arr.length; j++)
			{
				if(arr[j]>maxEle)
					maxEle=arr[j];
			}
			
			if((maxEle-arr[i]) > maxprofit)
				maxprofit=maxEle-arr[i];
				
		}
		System.out.println(maxprofit);
	}
}

public class Program_8 {
	public static void main(String[] args) {
		int[] arr = {7,6,4,3,1};
		new StockMarketClass().maxProfit(arr);

	}

}
