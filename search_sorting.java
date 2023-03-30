package dayo7_Array;

public class search_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int temp;
		int arr[]= {232,34,5,67,78,23,42};
		           
		
		for(int j=0;j<arr.length-1;j++)
		{
		for(int i=0;i<arr.length-1-j;i++)
		{
		if(arr[i]<arr[i+1])
		{
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]= temp;
			
		}
		}
		}
  for(int p=0;p<arr.length;p++)		{
			
			System.out.print("   "+ arr[p]);
		}
       System.out.println();
		
		
	 
	}

}
