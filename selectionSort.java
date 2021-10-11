
public class selectionSort {

	static void swap(int a[],int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int a[]= {4,1,9,2,3,6};
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			
			if(min!=i)
			{
				swap(a,min,i);
			}
		}
		

		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		} 
		

	}

}
