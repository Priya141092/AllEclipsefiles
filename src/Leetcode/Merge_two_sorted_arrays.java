package Leetcode;

public class Merge_two_sorted_arrays {

	public static void main(String[] args) {
		
		int nums1 []= {2,2,3,4,5,12};
		int nums2 [] = {6,7,8,9,10};
		int nums3[] = new int[nums1.length+nums2.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<nums1.length && j< nums2.length)
		{
			if(nums1[i]<=nums2[j])
			{
				nums3[k]=nums1[i];
				i++;
				k++;
				
			}
			
			else
			{
				nums3[k]=nums2[j];
				j++;
				k++;
			}
		}
		
		while(i<nums1.length)
		{
			nums3[k]=nums1[i];
			i++;
			k++;
		}
		while(j<nums2.length)
		{
			nums3[k]=nums2[j];
			j++;
			k++;
		}
		
	
     for(int m=0;m<nums3.length;m++)
     {
		System.out.println(nums3[m]);
     }
	}

}
