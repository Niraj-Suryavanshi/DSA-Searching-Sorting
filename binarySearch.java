
public class binarySearch {
	public static void binarySearch(int arr[],int first,int key,int last)
	{
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]== key)
		{
			System.out.println("Element is found at location at:"+mid);
			break;
		}else if(arr[mid]<key)
		{
			last=mid-1;
		}else
		{
			first=mid+1;
			
		}
			mid=(first+last)/2;
	
		
		}
		if(first>last)
		{
			System.out.println("Element is not found");
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {-9,-3,4,232,553,999};
		int key=400;
		int last=arr.length-1;
		binarySearch(arr,0,key,last);
		
	}

}
