package Easy_Array_Problems;

public class Left_rotate_array_by_1_place {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int temp =arr[0];
		
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		 arr[arr.length-1]=temp;
		 
		 for(int k=0;k<arr.length;k++)
		 {
		 System.out.println(arr[k]);
		 }
	}
	
	

}
