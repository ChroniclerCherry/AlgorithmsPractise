
public class QuickSort {
	public static void main (String[] args) {
		
		int[] nums = new int[20];
		
		for (int i = 0; i<nums.length ; i++) {
			nums[i] = (int)(Math.random()*100);
			System.out.printf("%d ", nums[i]);
		}
		
		quickSort(nums);
		System.out.println();
		
		for (int i : nums) {
			System.out.printf("%d ",i);
		}
		
	}
	
	public static void quickSort(int[] nums) {
		quickSortInternal(nums,0,nums.length-1);
	}
	
	private static void quickSortInternal(int[] nums, int l, int h) {
		if (l < h) {
			int pivot = partition(nums,l,h);
			quickSortInternal(nums,l,pivot-1);
			quickSortInternal(nums,pivot+1,h);
		}
	}
	
	private static int partition(int[] nums, int l, int h) {
		int pivot = nums[h];
		int i = l;
		
		for (int j = l; j < h; j++) {
			if (nums[j] < pivot) {
				swap(nums,i,j);
				i++;
			}
		}
		swap(nums,i,h);
		return i;
	}
	
	private static void swap(int[] nums, int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
}
