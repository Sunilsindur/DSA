import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {-1,2,0};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionsort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - 1 - i;
            // find the max item in the remaining array
            int maxindex = getmaxindex(arr,0,last);
            //swap max item with there respective index
            swap(arr,maxindex,last);

        }
    }

    static int getmaxindex(int[] arr,int start,int end)
    {
        int max = start;
        for (int i = start; i <=end ;i++) {
            if(arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int max,int last)
    {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}


