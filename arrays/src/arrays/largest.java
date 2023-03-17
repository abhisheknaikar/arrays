package arrays;

public class largest {

	public static void main(String[] args) {
	    
		int arr[]= {2,5,34,7,5,9};
		
		int largest= arr[0];
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println("The largest number of array is " + largest);

	}

}
