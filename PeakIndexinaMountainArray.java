class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start<end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1])
            {
                // yor are in dec part of array
                //this may be the ans ,but look at left 
                end = mid;
            }
            else
            {
              // you are in asc part of array
                start = mid + 1;//  because we know that mid+1 is > than mid hence we egnoring the mid ; 
            }
        }
      // At the end start == end and pointing to the largest number because of the 2 cheks above
      //start and end is always trying to find max element in the above to checks
        return start;
    }
}
