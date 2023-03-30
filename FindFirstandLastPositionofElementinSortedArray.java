class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};
        int first = search(nums,target,true);
        int last = search(nums,target,false);
        ans[0] = first;
        ans[1] = last;
        return ans;
        
    }

    int search(int nums[],int target,boolean firstindex)
    {
        int ans = -1;
        int start = 0; 
        int end = nums.length - 1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid]>target)
            {
                end = end - 1;
            }
            else if(nums[mid]<target)
            {
                start = mid + 1;
            }
            else
            {
                if(firstindex)
                {
                    ans = mid;
                    end = mid - 1;
                }
                else
                {
                    ans = mid;
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
