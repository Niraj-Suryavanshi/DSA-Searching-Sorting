
public class mergeSort {
	
	public static void merge(int a[],int l,int mid,int h)
	{
		int b[]=new int[h+1];
		int i=l;
		int j=mid+1;
		int c=l	;
		while(i<=mid && j<=h)
		{
			if(a[i]<=a[j])
			{
				b[c]=a[i];
				
				i++;
			}
			else
			{
				b[c]=a[j];
				j++;
			}
			c++;
		 }
		if(i>mid)
		{
			while(j<=h)
			{
				b[c]=a[j];
				j++;
				c++;
			}
		}
		else 
		{
		while(i<=mid)
			{
				b[c]=a[i];
				c++;
				i++;
			}
		}	
		
		 for(int p = l ; p <= h; p++)
             a[p] = b[p];	
	
	}
	

	public static void sort(int a[],int l,int h)
	{
		if(l<h)
		{
			 int mid=(l+h)/2;
			 sort(a,l,mid);
			 sort(a,mid+1,h);
			 merge(a,l,mid,h);
		}	
		
		
	}
	
	public static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		int a[]= {9,4,7,6,3,1,5};
		
		System.out.println("Before sorting:");
		
		printArray(a);
		
		
		sort(a,0,a.length-1);
		System.out.println();
		System.out.println("After sorting");

		printArray(a);
		
		

	}

}
