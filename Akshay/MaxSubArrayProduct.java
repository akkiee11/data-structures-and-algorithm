class MaxSubArrayProduct {

   public int maxProduct(int[] nums) {
        int product = 1;
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            for(int j=i;j<nums.length;j++) {
                for(int k=i;k<=j;k++) {
                    product *= nums[k];
                }
                if(product > maxProduct) {
                    maxProduct = product;
                }
                product = 1;
            }
        }
        return maxProduct;
    }

   //Naive Approach O(n) O(1)
   public int maxProduct2(int[] nums) {
        int maxMulti =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
             int multi = 1;
           for(int j =i;j<nums.length;j++){
            multi *= nums[j];
            maxMulti = Math.max(multi,maxMulti);
           }
        }
        return maxMulti;
    }

    //Optimize solution O(n) O(1)
    //We have use second for loop to get maximum product if we missed if the array contains odd negative elements.
    public int maxProduct3(int[] nums) {
        int maxProduct =Integer.MIN_VALUE;
        int product = 1;
        int n = nums.length;
        for(int i=0;i<n;i++){
          if(product == 0){
              product = 1;
          }
          
          product *= nums[i];
          maxProduct = Math.max(product,maxProduct);  
        }
        
        product = 1;
        for(int i = n -1 ; i>=0 ; i--){
          if(product == 0){
              product = 1;
          }
          
          product *= nums[i];
          maxProduct = Math.max(product,maxProduct);  
        }
        return maxProduct;
    }
}