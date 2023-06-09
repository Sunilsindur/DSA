import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr)
    {
        boolean swapped;
        // for each step the max element will came at the respective position
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1]>arr[j])
                {
                    // swap if element is smaller than previous element
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            // if array is already sorted than stop the program
            if(!swapped)
            {
                break;
            }
        }
    }
}
