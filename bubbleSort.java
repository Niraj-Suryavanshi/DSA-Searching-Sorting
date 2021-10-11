
public class bubbleSort {

	static void swaped(int a[],int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3};
		int n=3;
		for(int i=0;i<n-1;i++)
		{	
			boolean swapped=false;
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j+1]<a[j])
				{
					swaped(a,j+1,j);
					swapped=true;
				}
			}
			
			if(!swapped)
			{
				break;
			}
		}
		
		bubbleSort b;
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
