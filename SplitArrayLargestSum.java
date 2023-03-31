public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int arr[] = {7,2,5,10,8};
        int m =2;
        System.out.println(SplitArrayLargestSum1(arr,m));
    }

    static int SplitArrayLargestSum1(int arr[],int m)
    {
        // find start and end first
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]);
            end += arr[i];
        }
        //Binary search is applied
        while(start<end)
        {
            int mid = start + (end - start)/2;//maximum sum = mid calculated
            int sum = 0;
            int pieces = 1;
            for(int num : arr)
            {
                //if sum of sumarry is excluding maximum sum of subarray
                if(sum+num > mid)
                {
                   sum = num;//create new subarray
                   pieces++;//increase pieces number
                }
                else {
                    sum += num;
                }



            }
            if(pieces>m)
            {
                start = mid +1;
            }
            else
            {
                end = mid;
            }
        }
        return end;
    }
}
