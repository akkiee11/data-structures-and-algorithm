import java.util.Scanner;
import java.util.TreeMap;

class NonRepeatingNumbers
{
	public static int[] singleNumber(int[] nums) {
		int[] arr = new int[2];
		int k = 0;
		TreeMap<Integer, Integer> hashMap = new TreeMap<>();
		for (int num : nums) {
			if (hashMap.containsKey(num)) {
				int of = hashMap.get(num);
				hashMap.put(num, of + 1);
			} else {
				hashMap.put(num, 1);
			}
		}
		for (Integer key : hashMap.keySet()) {
			if (hashMap.get(key) == 1) {
				arr[k++] = key;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] answer = singleNumber(arr);
		for(int ans : answer){
			System.out.print(ans + " ");
		}

	}

}