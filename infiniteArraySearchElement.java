
public class infiniteArraySearchElement {
		public static int searchInfinite(int arr[],int key)
		{ 
			int low=0;
			int high=1;
			
			while(arr[high]<key)
			{
				low=high;
				high=2*low;
			}
			
			return binarySearch(arr,low,key,high);
		}
		
		
		
		
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
			int arr[]= {1,3,6,7,88,99,100};
			
			int c=88;
			int result=searchInfinite(arr,c);
			
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
