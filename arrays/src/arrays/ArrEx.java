package arrays;

public class ArrEx {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		
		for( int i=0;i<arr.length;i++)
		//for(int i=arr.length-1;i<=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}

}
