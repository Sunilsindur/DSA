import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
       int[] arr = {1,5,2,3,4};
       quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] nums,int low,int hi)
    {
        if(low>=hi) return;
        int s = low;
        int e = hi;
        int m = s + (e-s)/2;

        int pivot = nums[m];

        while(s<=e)
        {
                // if it already sorted it will not swap
                while (nums[s] < pivot)
                {
                    s++;
                }

                while (nums[e] > pivot)
                {
                    e--;
                }

                if(s<=e)
                {
                    int temp = nums[s];
                    nums[s] = nums[e];
                    nums[e] = temp;
                    s++;
                    e--;

                }
        }
        //now my pivot ele is on correct position sort two halves now
        quicksort(nums,low,e);
        quicksort(nums,s,hi);


    }
}
