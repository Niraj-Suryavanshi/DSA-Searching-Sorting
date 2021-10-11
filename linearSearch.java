
public class linearSearch {
	
	public static int search(int arr[],int x)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
				return i;
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {2,212,32,24,322};
		int x=32;
		int result=search(arr,x);
		if(result==-1)
			System.out.println("Element is not present in the list");
		else
			System.out.println("Element is present at index: "+result);
		
		
	}

}
