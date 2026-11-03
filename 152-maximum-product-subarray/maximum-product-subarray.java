class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        int L = 1;
        int R = 1;
        int ans = nums[0];

        for(int i = 0; i < n; i++){
            if( L == 0){
                L = 1;
            }
            if( R == 0){
                R = 1;
            }
            L = L*nums[i];
            R = R*nums[n-1-i];

            ans = Math.max(ans,Math.max(L,R));
             
        }
        return ans;

        
    }
}