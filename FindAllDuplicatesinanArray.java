class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while(i<nums.length)
        {
                int correct = nums[i] - 1;
                if(nums[correct] != nums[i])
               {
                    int temp = nums[correct];
                     nums[correct] = nums[i];
                     nums[i] = temp;
                }
                else
                {
                    i++;
                }

        } 
                for(int index = 0;index<nums.length;index++)
                {
                    if(nums[index] != index+1 )
                    {
                        ans.add(nums[index]);
                    }
                }
        return ans; 

    }
    
}
