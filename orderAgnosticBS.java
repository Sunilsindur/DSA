public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 8;
        int ans = orderAgnostocBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnostocBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        boolean isAS = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAS) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }
        return -1;
    }

}
