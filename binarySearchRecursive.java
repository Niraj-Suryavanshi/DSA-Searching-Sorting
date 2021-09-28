
public class binarySearchRecursive {
	public static int binarySearch(int arr[],int first,int key,int last)
	{
		if(first>last)
			return -1;
		
		int mid=(first+last)/2;
		
		if(arr[mid]==key)
		{
			return mid;
		}
		
		if(key>arr[mid])
		{
			return binarySearch(arr, mid+1, key, last);
		}
		else
		{
			return binarySearch(arr, first, key, mid-1);
		}
	
	}

	public static void main(String[] args) {
		int arr[]= {-9,-3,4,232,553,999};
		int key=999;
		int last=arr.length-1;
		int result=binarySearch(arr,0,key,last);
	    if(result==-1)
	    {
		    System.out.println("Element is not present");
	    }
	    else
	    {
		    System.out.println("Element is present at:"+result);
	    }
	}

}
