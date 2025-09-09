public class MaximumDifferenceProblemWithOrder {
    public static int maxDiff(int[] arr){
        int maxdif=arr[1]-arr[0];//-1
        int minVal=arr[0];
        for(int i=0;i<arr.length;i++){
            maxdif=Math.max(maxdif,arr[i]-minVal);
            minVal=Math.min(minVal,arr[i]);
        }

        return maxdif;
    }
    public static void main(String[] args) {
        int[] arr={2,3,10,6,4,8,1};// 8
        int[] arr1={7,9,5,6,3,2};// 2
        System.out.println(maxDiff(arr));
        System.out.println(maxDiff(arr1));
    }
}
