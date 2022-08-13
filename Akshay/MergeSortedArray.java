
public class MergeSortedArray {

	//GFG Solution O(n*m) O(1)
	public static void merge(long[] nums1, long[] nums2, int n, int m) {
		int k;
		int i;
		for (i = 0; i < nums1.length; i++) {
			if (nums1[i] > nums2[0]) {
				long temp = nums1[i];
				nums1[i] = nums2[0];
				nums2[0] = temp;
			}

			long first = nums2[0];
			for (k = 1; k < nums2.length && nums2[k] < first; k++) {
				nums2[(k - 1)] = nums2[k];
			}
			nums2[(k - 1)] = first;
		}
	}

	//GFG Solution O(n) O(n)
	public static void merge2(long[] nums1, long[] nums2, int n, int m) {
		long arr [] = new long[nums1.length + nums2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < nums1.length && j < nums2.length){
			if(nums1[i] < nums2[j]){
				arr[k] = nums1[i];
				i++;
			}else{
				arr[k] = nums2[j];
				j++;
			}
			k++;
		}

		while(i < nums1.length){
			arr[k] = nums1[i];
			i++;
			k++;
		}
		while(j < nums2.length){
			arr[k] = nums2[j];
			j++;
			k++;
		}

		int p =0;
		for(i =0;i<nums1.length + nums2.length;i++){
			if(i < nums1.length){
				nums1[i] = arr[i];
			}else{
				nums2[p++] = arr[i];
			}
		}

	}
	
	//Leetcode Solution O(n+m) O(1)
	public static void merge3(int[] nums1, int m, int[] nums2, int n) {
		int k;
		if(n ==0){
			return;
		}
		for (int i = 0; i < nums1.length -n; i++) {
			if (nums1[i] > nums2[0]) {
				int temp = nums1[i];
				nums1[i] = nums2[0];
				nums2[0] = temp;
			}

			int first = nums2[0];
			for (k = 1; k < nums2.length && nums2[k] < first; k++) {
				nums2[k - 1] = nums2[k];
			}
			nums2[k - 1] = first;
		}
		int j =0;
		for(int i =nums1.length - n;i < nums1.length;i++){
			nums1[i] = nums2[j++];
		}

	}

	//Leetcode Solution O(n) O(n)
	public static void merge4(int[] nums1, int m, int[] nums2, int n) {
		int[] arr = new int[n+m];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < m && j < n){
			if(nums1[i] > nums2[j]){
				arr[k] = nums2[j];
				j++;

			}else{
				arr[k] = nums1[i];
				i++;
			}
			k++;

		}

		while(i < m){
			arr[k] = nums1[i];
			i++;
			k++;
		}
		while(j < n){
			arr[k] = nums2[j];
			j++;
			k++;
		}

		for(i =0;i<n+m;i++){
			nums1[i] = arr[i];
		}
	}

}