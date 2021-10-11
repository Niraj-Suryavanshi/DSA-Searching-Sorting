
public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,4,1,5,9,2};
		int n=6;
		for(int i=1;i<n;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
