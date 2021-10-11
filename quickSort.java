
public class quickSort {
	
	int partition(int a[],int l,int h)
	{
		int pivot=a[l];
		int i=l;
		int j=h;
		while(i<j)
		{
			while(a[i]<=pivot)i++;
			while(a[j]>pivot)j--;
			if(i<j)
				swap(a,i,j);
		}
		swap(a,j,l);
		return j;
	}
	
	void qsort(int a[],int l,int h)
	{
		if(l<h)
		{
			int pivot=partition(a,l,h);
			qsort(a,l,pivot-1);
			qsort(a,pivot+1,h);
		}
	}
	
	void swap(int a[],int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	void printArr(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	} 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {
			4,6,2,5,7,9,1,3	
		};
		int n=a.length;
		
		quickSort q=new quickSort();
		
		q.qsort(a,0,n-1);
		
		q.printArr(a,n);
				

	}

}
