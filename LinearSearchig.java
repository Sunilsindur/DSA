public class LinearSearchig {
    public static void main(String[] args) {
        int[] arr = {22,44,3,45,76,89,45,68};
        int target = 68;
        boolean ans = linear_search(arr,target);
        System.out.println(ans);
    }

    static boolean linear_search(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int element : arr){
                if(element==target)
                {
                    return true;
                }
        }
        return false;

    }
}
