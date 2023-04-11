import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {77,5,4,3,-2,-1,0};
        Insertionsort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Insertionsort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j >0 ; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
                }
            }

        }
    }

    static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}
