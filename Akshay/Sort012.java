class Sort012 {

	//Naive Approach O(nlogn) O(1)
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    //Optimize Approach O(n) O(1)
    //Used two for loop
     public void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i] == 0){
                countZero++;
            } else if(nums[i]==1){
                countOne++;
            }else{
                countTwo++;
            }
        }
        
      for(int i=0;i<n;i++){
          if(countZero > 0){
              nums[i] = 0;
              countZero--;
          }else if(countOne > 0){
              nums[i] = 1;
              countOne--;
          }else{
              nums[i] = 2;
          }
      }  
    }

    
}