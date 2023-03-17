package arrays;

public class largestnumber 
{
	public static void main(String []args)
	{
	int largest;
   int arr[]= new int [5];
   {
   arr[0]=30;
   arr[1]=10;
   arr[2]=60;
   arr[3]=20;
   arr[4]=40;
   
   largest = arr[0];
   for(int i=0; i<arr.length; i++)
	   if (arr[i]>largest)
	   {
      largest = arr[i];
	   
	   }
   System.out.println("The largest number of arry  is :"+largest);
   }
   }
}
